package org.openxava.hibernate.impl;

import java.util.*;

import org.hibernate.*;
import org.hibernate.event.*;
import org.openxava.calculators.*;
import org.openxava.model.*;
import org.openxava.model.meta.*;
import org.openxava.util.*;
import org.openxava.util.meta.*;

public class CalculatorsListener implements PreInsertEventListener, PreUpdateEventListener, PreDeleteEventListener, PostLoadEventListener {
	
	private static CalculatorsListener instance = new CalculatorsListener();
	
	public static CalculatorsListener getInstance() {
		return instance;
	}
	
	public CalculatorsListener() { 		
	}
	
	public void onPostLoad(PostLoadEvent ev) {
		String modelName = "unknow";
		try {
			Object entity = ev.getEntity();
			if (!(entity instanceof IModel)) return;
			IModel model = (IModel) entity;
			executeCalculators(model, model.getMetaModel().getMetaCalculatorsPostLoad());
		}
		catch (Exception ex) {
			ex.printStackTrace();			
			throw new HibernateException(XavaResources.getString("entity_load_error", modelName, ex.getLocalizedMessage()));
		}						
	}

	public boolean onPreInsert(PreInsertEvent ev) {
		String modelName = "unknow";
		try {
			Object entity = ev.getEntity();
			if (!(entity instanceof IModel)) return false;
			IModel model = (IModel) entity;
			executeCalculators(model, model.getMetaModel().getMetaCalculatorsPostCreate());
			return false;
		}
		catch (Exception ex) {
			ex.printStackTrace();			
			throw new HibernateException(XavaResources.getString("entity_create_error", modelName, ex.getLocalizedMessage()));
		}				
	}

	public boolean onPreUpdate(PreUpdateEvent ev) {
		String modelName = "unknow";
		try {
			Object entity = ev.getEntity();
			if (!(entity instanceof IModel)) return false;
			IModel model = (IModel) entity;
			executeCalculators(model, model.getMetaModel().getMetaCalculatorsPostModify());
			return false;
		}
		catch (Exception ex) {
			ex.printStackTrace();			
			throw new HibernateException(XavaResources.getString("entity_modify_error", modelName, ex.getLocalizedMessage()));
		}				
	}
	
	public boolean onPreDelete(PreDeleteEvent ev) {
		String modelName = "unknow";
		try {
			Object entity = ev.getEntity();
			if (!(entity instanceof IModel)) return false;
			IModel model = (IModel) entity;
			executeCalculators(model, model.getMetaModel().getMetaCalculatorsPreRemove());
			return false;
		}
		catch (Exception ex) {
			ex.printStackTrace();			
			throw new HibernateException(XavaResources.getString("entity_remove_error", modelName, ex.getLocalizedMessage()));
		}				
	}
	
	private void executeCalculators(IModel model, Collection calculators) throws Exception {		
		MetaModel metaModel = model.getMetaModel();
		if (calculators.isEmpty()) return;
		PropertiesManager pm = new PropertiesManager(model);			 
		for (Iterator it = calculators.iterator(); it.hasNext();) {
			MetaCalculator metaCalculator = (MetaCalculator) it.next();				
			ICalculator calculator = metaCalculator.createCalculator();
			PropertiesManager pmCalculator = new PropertiesManager(calculator);
			for (Iterator itSets=metaCalculator.getMetaSetsWithoutValue().iterator(); itSets.hasNext();) {
				MetaSet set = (MetaSet) itSets.next();
				pmCalculator.executeSet(set.getPropertyName(), pm.executeGet(set.getPropertyNameFrom()));
			}
			if (calculator instanceof IJDBCCalculator) {
				((IJDBCCalculator) calculator).setConnectionProvider(DataSourceConnectionProvider.getByComponent(metaModel.getMetaComponent().getName()));
			}
			if (calculator instanceof IModelCalculator) {
				((IModelCalculator) calculator).setModel(model);
			}
			if (calculator instanceof IEntityCalculator) {
				((IEntityCalculator) calculator).setEntity(model);
			}				 			
			calculator.calculate();				 								
		}			
	}

}

