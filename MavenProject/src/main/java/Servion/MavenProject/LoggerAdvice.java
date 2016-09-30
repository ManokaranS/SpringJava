package Servion.MavenProject;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggerAdvice implements MethodBeforeAdvice{
	private static final String CLASS_NAME=LoggerAdvice.class.getName();
	private static Logger logger=Logger.getLogger(CLASS_NAME);
	
	public void before(Method method,Object[] param, Object chain) throws Throwable
			{
		
		logger.entering(chain.getClass().getName(),method.getName());
		logger.info("Logger Invoke At "+chain.getClass().getName()+" "+method.getName());
		Customer customer=(Customer)param[0];
		logger.exiting("Logger Class Exit "+chain.getClass().getName(),method.getName());
		
			}
}