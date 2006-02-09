package org.openxava.util;

import java.io.*;
import java.sql.*;
import java.util.*;

import javax.naming.*;
import javax.sql.*;

import org.openxava.component.*;
import org.openxava.hibernate.*;

/**
 * Adapter from JNDI DataSource interface to IConnectionProvider interface.
 * 
 * @author Javier Paniza
 */
public class DataSourceConnectionProvider implements IConnectionProvider, Serializable {
	
	private static Properties datasourcesJNDIByPackage;	
	
	private DataSource dataSource;
	private String dataSourceJNDI;	
	private String user;
	private String password;

	private static Map providers;
	
	public static IConnectionProvider createByComponent(String componentName) throws XavaException {
		String packageName = MetaComponent.get(componentName).getPackageNameWithSlashWithoutModel();		
		String jndi = getDatasourcesJNDIByPackage().getProperty(packageName);
		
		if (Is.emptyString(jndi)) {
			throw new XavaException("no_data_source_for_component", componentName);
		}
		DataSourceConnectionProvider provider = new DataSourceConnectionProvider();		
		provider.setDataSourceJNDI(jndi);
		return provider;
	}
	
	public static IConnectionProvider getByComponent(String componentName) throws XavaException {
		if (providers == null) providers = new HashMap();
		IConnectionProvider provider = (IConnectionProvider) providers.get(componentName);
		if (provider == null) {
			provider = createByComponent(componentName);
		}		
		return provider;
	}
	
	/**
	 * DataSource to wrap
	 * @throws NamingException
	 */	
	public DataSource getDataSource() throws NamingException {
		if (dataSource == null) {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup(getDataSourceJNDI());						
		}
		return dataSource;
	}
		
	/**
	 * DataSource to wrap
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	/**
	 * JNDI of DataSource to wrap. <p>
	 * Only works if datasource == null 
	 */
	public String getDataSourceJNDI() {
		return dataSourceJNDI;
	}

	/**
	 * JNDI of DataSource to wrap. <p>
	 * Only works if datasource == null 
	 */	
	public void setDataSourceJNDI(String dataSourceJDNI) {
		this.dataSourceJNDI = dataSourceJDNI;
	}
	
	public Connection getConnection() throws SQLException {
		try {
			if (Is.emptyString(getUser())) {
				return getDataSource().getConnection();
			}
			else {
				return getDataSource().getConnection(getUser(), getPassword());
			}
		}
		catch (NamingException ex) {
			// In case of working outside an application server (for example inside junit)
			System.out.println(XavaResources.getString("no_datasource_found_using_hibernate_connection_warning", dataSourceJNDI));
			return XHibernate.getSession().connection();
		}
	}
	
	public Connection getConnection(String nombreDataSource) throws SQLException {
		return getConnection();
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public String getUser() {
		return user;
	}
	
	public void setDefaultDataSource(String dataSourceName) {
	}
		
	private static Properties getDatasourcesJNDIByPackage() throws XavaException {
		if (datasourcesJNDIByPackage == null) {
			try {
				PropertiesReader reader = new PropertiesReader(DataSourceConnectionProvider.class, "datasource.properties"); 				
				datasourcesJNDIByPackage = reader.get();				
			}
			catch (IOException ex) {
				ex.printStackTrace();
				throw new XavaException(ex.getLocalizedMessage());
			}
		}		
		return datasourcesJNDIByPackage;
	}
	
}
