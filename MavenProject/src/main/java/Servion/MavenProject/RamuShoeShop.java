package Servion.MavenProject;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class RamuShoeShop extends ShoeShop {
	private static final String CLASS_NAME=RamuShoeShop.class.getName();
	private static Logger logger=Logger.getLogger(CLASS_NAME);
	
	public Shoe SellShoe(Customer customer) {
		String methodname="SellShoe";
		logger.entering(CLASS_NAME, methodname);
		logger.info("Sellshoe called");
		logger.exiting(CLASS_NAME, methodname);
		return getFactory().makeshoe();
	}

}
