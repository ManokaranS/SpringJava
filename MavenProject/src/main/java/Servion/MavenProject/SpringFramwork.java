package Servion.MavenProject;

import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Logger;

public class SpringFramwork {
	private static final String CLASS_NAME=SpringFramwork.class.getName();
	private static Logger logger=Logger.getLogger(CLASS_NAME);
public static ShoeShop getShop(){
	String methodname="getShop";
	logger.entering(CLASS_NAME, methodname);
	logger.info("Sellshoe called");
	logger.exiting(CLASS_NAME, methodname);
	try{
		Properties prop=new Properties();
		prop.load(new FileReader("config.properties"));
		String shopclass=prop.getProperty("shop");
		String factoryclass=prop.getProperty("lakani");
		ShoeFactory factory=(ShoeFactory)Class.forName(factoryclass).newInstance();
		ShoeShop seller=(ShoeShop)Class.forName(shopclass).newInstance();
		
		// deendancy injection
		seller.setFactory(factory);
		logger.info("Sellshoe called");
		logger.exiting(CLASS_NAME, methodname);
		return seller;
	}catch(Exception e){
		logger.info("Sellshoe called");
		logger.exiting(CLASS_NAME, methodname);
		return null;
		
	}
}

}
