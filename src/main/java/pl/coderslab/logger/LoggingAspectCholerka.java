package pl.coderslab.logger;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectCholerka {	 
	    public void repositoryMethods() {};
	    @Pointcut("within(pl.coderslab..*)")
	    /*//
	    //execution(* org.springframework.data.repository.CrudRepository+.save(..))
	    	//within(pl.coderslab..*)
	    */
	    @Before("repositoryMethods()")
	    public void logMethodCall(JoinPoint jp) {
	    	
	        System.out.println("cholera gdzie to jest : (");
	        System.out.println("==============================Widze Cie ============================================");
	    }
	    
}
