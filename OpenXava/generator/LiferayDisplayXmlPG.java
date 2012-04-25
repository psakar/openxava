
/* Generated by TL2Java Version 1.2, April 9, 2001 */
import org.w3c.dom.*;
import java.io.*;
import java.util.*;
import java.util.*;
import org.openxava.application.meta.*;
import org.openxava.generators.Generators;
import org.openxava.util.*;

/**
 * Program Generator created by TL2Java
 * @version Tue Apr 24 10:19:13 CEST 2012
 */
public class LiferayDisplayXmlPG {
    Properties properties = new Properties();

    /**
     * This method generates the output given a context and output stream
     */
    public boolean generate(XPathContext context, ProgramWriter out) {
        try {    out.print("<?xml version=\"1.0\" encoding=\"");
    out.print(properties.getProperty("arg4"));
    out.print("\"?>\n\n<!DOCTYPE display PUBLIC \"-//Liferay//DTD Display 4.0.0//EN\" \"http://www.liferay.com/dtd/liferay-display_4_0_0.dtd\">");
    out.print("\n\n<!-- Generated by OpenXava: ");
    out.print(new Date());
    out.print(" -->");
    
    String applicationName = properties.getProperty("arg3");
    MetaApplication application = MetaApplications.getMetaApplication(applicationName);
    String encoding = properties.getProperty("arg4");
    
    
    out.print(" \n<display>\n\t<category name=\"category.");
    out.print(Strings.toCharSet(application.getName(), encoding));
    out.print("\">");
    
    for (Iterator it=application.getMetaModules().iterator(); it.hasNext(); ) {
    	MetaModule module = (MetaModule) it.next();
    
    out.print(" \n\t\t<portlet id=\"");
    out.print(Strings.toCharSet(module.getName(), encoding));
    out.print("\" />");
    
    }
    
    out.print("   \n\t</category>\n</display>");
    
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
            LiferayDisplayXmlPG pg = new LiferayDisplayXmlPG();
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
        { "Tue Apr 24 10:19:14 CEST 2012", // date this file was generated
             "../OpenXava/generator/liferayDisplayxml.xml", // input file
             "../OpenXava/generator/LiferayDisplayXmlPG.java" }, // output file
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