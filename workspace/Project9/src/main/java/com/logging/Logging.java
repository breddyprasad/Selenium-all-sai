package com.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging {
	public static void genReport(String Message){
    	//System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
    	 Logger log=Logger.getLogger("projectReport");
		  PropertyConfigurator.configure("log4j.properties");
		  //System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		  log.info(Message);
		 
    }
}
