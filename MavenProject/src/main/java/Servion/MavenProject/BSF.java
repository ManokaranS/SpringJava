package Servion.MavenProject;

import java.util.logging.Logger;

public class BSF extends ShoeFactory{
	private static final String CLASS_NAME=BSF.class.getName();
	private static Logger logger=Logger.getLogger(CLASS_NAME);
	
	public Shoe makeshoe() {
		String methodname="makeshoe";
		logger.entering(CLASS_NAME, methodname);
		logger.info("makeshoe called");
		logger.exiting(CLASS_NAME, methodname);
		return new LeatherShoe();
	}
	
}
