package pl.coderslab.logger;

import java.util.Date;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.springframework.aop.interceptor.AbstractMonitoringInterceptor;
import org.springframework.beans.factory.annotation.Autowired;

import pl.coderslab.entity.Tasks;
import pl.coderslab.repository.TasksRepository;

public class ProjectRepositoryMethodInterceptor /*extends AbstractMonitoringInterceptor */{
/*	@Autowired
	TasksRepository taskRep;
	public ProjectRepositoryMethodInterceptor() {
	}

	public ProjectRepositoryMethodInterceptor(boolean useDynamicLogger) {
		setUseDynamicLogger(useDynamicLogger);
	}

	@Override
	protected Object invokeUnderTrace(MethodInvocation invocation, Log logger) throws Throwable {
		
		String name = createInvocationTraceName(invocation);
        long start = System.currentTimeMillis();
        logger.info("Method " + name + " execution started at:" + new Date());
    	System.out.println("super szybki logger bum bum bum raz raz daw dwa dwa----------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    	taskRep.save(new Tasks());
        try {
            return invocation.proceed();
        } finally {
        	System.out.println("super szybki logger bum bum bum raz raz daw dwa dwa----------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
		
	}*/

}
