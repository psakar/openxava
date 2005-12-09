
// File generated by OpenXava: Fri Dec 09 09:29:56 CET 2005
// Archivo generado por OpenXava: Fri Dec 09 09:29:56 CET 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Invoice		Aggregate/Agregado: InvoiceDetail

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class InvoiceDetail implements java.io.Serializable, org.openxava.test.model.IInvoiceDetail {	
	
	// Properties/Propiedades 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getAmount() {
		try { 		
			org.openxava.test.calculators.DetailAmountCalculator amountCalculator= (org.openxava.test.calculators.DetailAmountCalculator)
				getMetaModel().getMetaProperty("amount").getMetaCalculator().getCalculator();  	
			
			amountCalculator.setUnitPrice(getUnitPrice());  	
			
			amountCalculator.setQuantity(getQuantity()); 
			return (java.math.BigDecimal) amountCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "Amount", "InvoiceDetail", ex.getLocalizedMessage()));
		}
	}
	public void setAmount(java.math.BigDecimal newAmount) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private org.openxava.converters.BigDecimalNumberConverter unitPriceConverter;
	private org.openxava.converters.BigDecimalNumberConverter getUnitPriceConverter() {
		if (unitPriceConverter == null) {
			try {
				unitPriceConverter = (org.openxava.converters.BigDecimalNumberConverter) 
					getMetaModel().getMapping().getConverter("unitPrice");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "unitPrice"));
			}
			
		}	
		return unitPriceConverter;
	} 
	private java.math.BigDecimal _unitPrice;
	private java.math.BigDecimal get_UnitPrice() {
		return _unitPrice;
	}
	private void set_UnitPrice(java.math.BigDecimal newUnitPrice) {
		this._unitPrice = newUnitPrice;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getUnitPrice() {
		try {
			return (java.math.BigDecimal) getUnitPriceConverter().toJava(get_UnitPrice());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPrice", "InvoiceDetail", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setUnitPrice(java.math.BigDecimal newUnitPrice) {
		try { 
			set_UnitPrice((java.math.BigDecimal) getUnitPriceConverter().toDB(newUnitPrice));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPrice", "InvoiceDetail", "java.math.BigDecimal"));
		}		
	} 
	private String oid;
	public String getOid() {
		return oid;
	}
	public void setOid(String newOid) {
		this.oid = newOid;
	} 
	private org.openxava.converters.TrimStringConverter remarksConverter;
	private org.openxava.converters.TrimStringConverter getRemarksConverter() {
		if (remarksConverter == null) {
			try {
				remarksConverter = (org.openxava.converters.TrimStringConverter) 
					getMetaModel().getMapping().getConverter("remarks");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "remarks"));
			}
			
		}	
		return remarksConverter;
	} 
	private java.lang.String _remarks;
	private java.lang.String get_Remarks() {
		return _remarks;
	}
	private void set_Remarks(java.lang.String newRemarks) {
		this._remarks = newRemarks;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getRemarks() {
		try {
			return (java.lang.String) getRemarksConverter().toJava(get_Remarks());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "InvoiceDetail", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setRemarks(java.lang.String newRemarks) {
		try { 
			set_Remarks((java.lang.String) getRemarksConverter().toDB(newRemarks));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "InvoiceDetail", "java.lang.String"));
		}		
	} 
	private org.openxava.converters.Date3Converter deliveryDateConverter;
	private org.openxava.converters.Date3Converter getDeliveryDateConverter() {
		if (deliveryDateConverter == null) {
			try {
				deliveryDateConverter = (org.openxava.converters.Date3Converter) 
					getMetaModel().getMapping().getMultipleConverter("deliveryDate");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "deliveryDate"));
			}
			
		}	
		return deliveryDateConverter;
	} 
	private int deliveryDate_day;
	private int getDeliveryDate_day() {
		return deliveryDate_day;
	}
	private void setDeliveryDate_day(int newValue) {
		this.deliveryDate_day = newValue;
	} 
	private int deliveryDate_month;
	private int getDeliveryDate_month() {
		return deliveryDate_month;
	}
	private void setDeliveryDate_month(int newValue) {
		this.deliveryDate_month = newValue;
	} 
	private int deliveryDate_year;
	private int getDeliveryDate_year() {
		return deliveryDate_year;
	}
	private void setDeliveryDate_year(int newValue) {
		this.deliveryDate_year = newValue;
	} 
	/**
	 * 
	 * 
	 */
	public java.util.Date getDeliveryDate() {
		try { 
			getDeliveryDateConverter().setDay(getDeliveryDate_day()); 
			getDeliveryDateConverter().setMonth(getDeliveryDate_month()); 
			getDeliveryDateConverter().setYear(getDeliveryDate_year()); 
			return (java.util.Date) getDeliveryDateConverter().toJava();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "DeliveryDate", "InvoiceDetail", "java.util.Date"));
		}
	}

	/**
	 * 
	 */
	public void setDeliveryDate(java.util.Date newDeliveryDate) {
		try { 
			getDeliveryDateConverter().toDB(newDeliveryDate); 
			setDeliveryDate_day(getDeliveryDateConverter().getDay()); 
			setDeliveryDate_month(getDeliveryDateConverter().getMonth()); 
			setDeliveryDate_year(getDeliveryDateConverter().getYear()); 			
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_db_error", "DeliveryDate", "InvoiceDetail"));
		}		
	} 
	private org.openxava.converters.IntegerNumberConverter quantityConverter;
	private org.openxava.converters.IntegerNumberConverter getQuantityConverter() {
		if (quantityConverter == null) {
			try {
				quantityConverter = (org.openxava.converters.IntegerNumberConverter) 
					getMetaModel().getMapping().getConverter("quantity");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "quantity"));
			}
			
		}	
		return quantityConverter;
	} 
	private java.lang.Integer _quantity;
	private java.lang.Integer get_Quantity() {
		return _quantity;
	}
	private void set_Quantity(java.lang.Integer newQuantity) {
		this._quantity = newQuantity;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getQuantity() {
		try {
			return ((Integer) getQuantityConverter().toJava(get_Quantity())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Quantity", "InvoiceDetail", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setQuantity(int newQuantity) {
		try { 
			set_Quantity((java.lang.Integer) getQuantityConverter().toDB(new Integer(newQuantity)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Quantity", "InvoiceDetail", "int"));
		}		
	} 
	private org.openxava.converters.IntegerNumberConverter serviceTypeConverter;
	private org.openxava.converters.IntegerNumberConverter getServiceTypeConverter() {
		if (serviceTypeConverter == null) {
			try {
				serviceTypeConverter = (org.openxava.converters.IntegerNumberConverter) 
					getMetaModel().getMapping().getConverter("serviceType");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "serviceType"));
			}
			
		}	
		return serviceTypeConverter;
	} 
	private java.lang.Integer _serviceType;
	private java.lang.Integer get_ServiceType() {
		return _serviceType;
	}
	private void set_ServiceType(java.lang.Integer newServiceType) {
		this._serviceType = newServiceType;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getServiceType() {
		try {
			return ((Integer) getServiceTypeConverter().toJava(get_ServiceType())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "ServiceType", "InvoiceDetail", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setServiceType(int newServiceType) {
		try { 
			set_ServiceType((java.lang.Integer) getServiceTypeConverter().toDB(new Integer(newServiceType)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "ServiceType", "InvoiceDetail", "int"));
		}		
	} 

	// References/Referencias 
	private org.openxava.test.model.IProduct product;
	public org.openxava.test.model.IProduct getProduct() {
		return product;
	}
	public void setProduct(org.openxava.test.model.IProduct newProduct) {
		this.product = newProduct;
	} 
	private org.openxava.test.model.ISeller soldBy;
	public org.openxava.test.model.ISeller getSoldBy() {
		return soldBy;
	}
	public void setSoldBy(org.openxava.test.model.ISeller newSeller) {
		this.soldBy = newSeller;
	} 
	private org.openxava.test.model.IInvoice invoice;
	public org.openxava.test.model.IInvoice getInvoice() {
		return invoice;
	}
	public void setInvoice(org.openxava.test.model.IInvoice newInvoice) {
		this.invoice = newInvoice;
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	private MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) { 
			metaModel = MetaComponent.get("Invoice").getMetaAggregate("InvoiceDetail"); 	
		}
		return metaModel;
	}
	
	public String toString() { 
		return "InvoiceDetail::" + oid;
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}