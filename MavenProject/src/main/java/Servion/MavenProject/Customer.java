package Servion.MavenProject;

import java.util.logging.Logger;

public class Customer {
private static String name;
private static final String CLASS_NAME=Customer.class.getName();
private static Logger logger=Logger.getLogger(CLASS_NAME);
public static String getName() {
	String methodname="getName";
	logger.entering(CLASS_NAME, methodname);
	logger.info("getname called");
	logger.exiting(CLASS_NAME, methodname);
	return name;
}

public void setName(String name) {
	String methodname="setName";
	logger.entering(CLASS_NAME, methodname);
	logger.info("setname called");
	logger.exiting(CLASS_NAME, methodname);
	this.name = name;
}
	

}
