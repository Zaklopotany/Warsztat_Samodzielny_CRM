package pl.coderslab.logger;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectCholerka {
	
	 private Logger logger = Logger.getLogger(LoggingAspectCholerka.class.getName());
	 
	    @Pointcut("@target(org.springframework.stereotype.Repository)")
	    public void repositoryMethods() {};
	 
	    @Before("repositoryMethods()")
	    public void logMethodCall(JoinPoint jp) {
	        String methodName = jp.getSignature().getName();
	        logger.info("Before " + methodName);
	        System.out.println("nie wiem gdzie to loguje : (");
	    }
	    
}
