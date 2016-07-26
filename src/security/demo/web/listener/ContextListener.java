package security.demo.web.listener;

import javax.servlet.ServletContextEvent;

import org.apache.log4j.Logger;

import security.demo.ligne.CodeLigne;
import security.notification.Notify;
import security.util.ApplicationException;
import security.util.test.TestInterface;
import security.util.test.TestResult;
import security.web.listener.AbstractWebContextListener;
import security.web.listener.ContextInitializedException;



public class ContextListener extends AbstractWebContextListener implements TestInterface{

	public static final Logger log = Logger.getLogger(ContextListener.class);

	private static final String VERSION = "1.2.4 - 20160310 11:00";

	
	@Override
	public void webContextDestroyed(ServletContextEvent arg0, 
									String appName) throws ContextInitializedException, ApplicationException {
		Notify.warn("Service Stopped:"+appName+" .");
		
	}

	@Override
	public void webContextInitialized(ServletContextEvent sce, 
									  String appName) throws ContextInitializedException, ApplicationException {	
		log.warn("--------------------------------------------------------------------------------------");			
		
		log.warn("Starting application:"+appName+" Version:"+VERSION);			
		log.warn("--------------------------------------------------------------------------------------");			

		// this init the class
		CodeLigne c=CodeLigne.LIGNE_1;
		

		log.warn("--------------------------------------------------------------------------------------");	
		log.warn("Context initialization finished:" + appName+" VERSION:"+VERSION);		
		log.warn("--------------------------------------------------------------------------------------");			

	}


	
	public void initFunction(){

	}

	
	public TestResult test(){
		TestResult ret=new TestResult("Application Root");
				
		
		return ret;
	}


	@Override
	public String getVersion() {
		return VERSION;
	}
}