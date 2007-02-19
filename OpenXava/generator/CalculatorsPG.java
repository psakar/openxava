
/* Generated by TL2Java Version 1.2, April 9, 2001 */
import org.w3c.dom.*;
import java.io.*;
import java.util.*;
import org.openxava.util.Strings;
import org.openxava.model.meta.*;
import org.openxava.calculators.*;
import org.openxava.util.meta.MetaSet;

/**
 * Program Generator created by TL2Java
 * @version Thu Feb 15 13:06:34 CET 2007
 */
public class CalculatorsPG {
    Properties properties = new Properties();


private MetaModel metaModel=null;
public void setMetaModel(MetaModel metaModel) {
	this.metaModel = metaModel;
}

private List calculators=null;
public void setCalculators(List calculators) {
	this.calculators = calculators;
}

private String type=null;
public void setType(String type) {
	this.type = type;
}

private String error=null;
public void setError(String error) {
	this.error = error;
}



    /**
     * This method generates the output given a context and output stream
     */
    public boolean generate(XPathContext context, ProgramWriter out) {
        try {    
    	String name = metaModel.getName();	
    	int count = calculators.size();
    	if (count > 0) {
    	
    out.print(" \n\t\tboolean cmtActivated = false;\n\t\tif (!org.openxava.hibernate.XHibernate.isCmt()) {\n\t\t\torg.openxava.hibernate.XHibernate.setCmt(true);\n\t\t\tcmtActivated = true;\n\t\t}\n\t\ttry {");
    
    	} 
    	for (int i=0; i<count; i++) {	 
    		MetaCalculator calculator = (MetaCalculator) calculators.get(i);
    		String calculatorClass = calculator.getClassName();				
    		
    out.print(" \t\t\n\t\t\t");
    out.print(calculatorClass);
    out.print(" calculator");
    out.print(i);
    out.print("= (");
    out.print(calculatorClass);
    out.print(")\n\t\t\t\tgetMetaModel().getMetaCalculator");
    out.print(type);
    out.print("(");
    out.print(i);
    out.print(").createCalculator();");
    	
    		Iterator itSets = calculator.getMetaSetsWithoutValue().iterator();
    		while (itSets.hasNext()) {
    			MetaSet set = (MetaSet) itSets.next();
    			String propertyNameInCalculator = Strings.firstUpper(set.getPropertyName());
    			String propertyNameFrom = set.getPropertyNameFrom();
    			if (propertyNameFrom.indexOf('.') >= 0) {
    				MetaProperty p = metaModel.getMetaProperty(propertyNameFrom);
    				if (p.isKey() || p.getMetaModel() instanceof MetaAggregate) {
    					propertyNameFrom = Strings.firstUpper(Strings.change(propertyNameFrom, ".", "_"));
    				}
    				else {
    					StringTokenizer st = new StringTokenizer(propertyNameFrom, ".");
    					String ref = st.nextToken();
    					String pro = st.nextToken();
    					propertyNameFrom = Strings.firstUpper(ref) + "().get" + Strings.firstUpper(pro);
    				}
    			}
    			else {
    				propertyNameFrom = Strings.firstUpper(propertyNameFrom);
    			}
    			String value = set.getValue();
    			if (set.hasValue()) {
    		
    out.print(" \n\t\t\tcalculator");
    out.print(i);
    out.print(".set");
    out.print(propertyNameInCalculator);
    out.print("(\"");
    out.print(value);
    out.print("\");");
    
    		} else {
    		
    out.print(" \n\t\t\tcalculator");
    out.print(i);
    out.print(".set");
    out.print(propertyNameInCalculator);
    out.print("(get");
    out.print(propertyNameFrom);
    out.print("());");
    	}} // else/poners
    		if (IModelCalculator.class.isAssignableFrom(Class.forName(calculatorClass))) {
    		
    out.print(" \n\t\t\tcalculator");
    out.print(i);
    out.print(".setModel(this);");
    }		
    		if (IEntityCalculator.class.isAssignableFrom(Class.forName(calculatorClass))) {
    		
    out.print(" \n\t\t\tcalculator");
    out.print(i);
    out.print(".setEntity(this);");
    }
    		if (IJDBCCalculator.class.isAssignableFrom(Class.forName(calculatorClass))) {
    		
    out.print(" \n\t\t\tcalculator");
    out.print(i);
    out.print(".setConnectionProvider(getPortableContext());");
    
    		}
    		
    out.print(" \n\t\t\tcalculator");
    out.print(i);
    out.print(".calculate();");
    		
    	} // for
    	if (count > 0) {	
    	
    out.print(" \n\t\t}\n\t\tcatch (Exception ex) {\n\t\t\tex.printStackTrace();\n\t\t\tthrow new EJBException(XavaResources.getString(\"");
    out.print(error);
    out.print("\", \"");
    out.print(name);
    out.print("\", ex.getLocalizedMessage()));\n\t\t}\n\t\tfinally {\n\t\t\tif (cmtActivated) {\n\t\t\t\torg.openxava.hibernate.XHibernate.setCmt(false);\n\t\t\t}\n\t\t}");
    
    	}
    	
    
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    /**
     * A program generator is typically (but not always) invoked
     * with a command line with arguments for the XML input file
     * and output file.
     */    
    public static void main(String[] args) {
        try {
            ProgramWriter out = args.length>=2
                ?new ProgramWriter(new FileOutputStream(args[1]))
                :new ProgramWriter(System.out);
            CalculatorsPG pg = new CalculatorsPG();
            for (int j=1; j<=args.length; ++j) {
                pg.properties.put("arg"+j, args[j-1]);
            }
            pg.generate(new XPathContext(args[0]), out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This array provides program generator development history
     */
    public String[][] history = {
        { "Thu Feb 15 13:06:34 CET 2007", // date this file was generated
             "../OpenXava/generator/calculators.xml", // input file
             "../OpenXava/generator/CalculatorsPG.java" }, // output file
        {"Mon Apr 09 16:45:30 EDT 2001", "TL2Java.xml", "TL2Java.java", }, 
        {"Mon Apr 09 16:39:37 EDT 2001", "TL2Java.xml", "TL2Java.java", }, 
        {"Mon Apr 09 16:37:21 EDT 2001", "TL2Java.xml", "TL2Java.java", }, 
        {"Fri Feb 09 14:49:11 EST 2001", "TL2Java.xml", "TL2Java.java", }, 
        {"Fri Feb 09 14:30:24 EST 2001", "TL2Java.xml", "TL2Java.java", }, 
        {"Fri Feb 09 11:13:01 EST 2001", "TL2Java.xml", "TL2Java.java", }, 
        {"Fri Feb 09 10:57:04 EST 2001", "TL2Java.xml", "TL2Java.java", }, 
        {"Wed Apr 26 11:15:41 EDT 2000", "..\\input\\TL2Java.xml", "TL2Java1.java", }, 
        {"April 2000", "hand coded", "TL2Java1.java", }, 

    };
}