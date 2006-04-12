package org.openxava.test.calculators;

import java.rmi.*;

import org.hibernate.*;
import org.openxava.calculators.*;
import org.openxava.hibernate.XHibernate;
import org.openxava.test.model.*;

/**
 * @author Javier Paniza
 */
public class FellowCarriersCalculator implements IModelCalculator {

	private ICarrier carrier;

	public Object calculate() throws Exception {
		
		int warehouseZoneNumber = carrier.getWarehouse().getZoneNumber();
		int warehouseNumber = carrier.getWarehouse().getNumber();
		Session session = XHibernate.getSession();		
		Query query = session.createQuery("from Carrier as o where " +
				"o.warehouse.zoneNumber = :warehouseZone AND " +
				"o.warehouse.number = :warehouseNumber AND " +
				"NOT (o.number = :number)");
		query.setInteger("warehouseZone", warehouseZoneNumber);
		query.setInteger("warehouseNumber", warehouseNumber);
		query.setInteger("number", carrier.getNumber());
		return query.list();
	}

	public void setModel(Object entity) throws RemoteException {
		carrier = (ICarrier) entity;		
	}

}
 