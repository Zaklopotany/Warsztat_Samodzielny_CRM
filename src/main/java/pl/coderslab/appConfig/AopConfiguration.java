package pl.coderslab.appConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "pl.coderslab")
*/public class AopConfiguration {
/*	
	@Pointcut("execution(* pl.coderslab.repository.ProjectsRepository.*(..))")
	public void monitor() {};
	
	@Bean
    public PerformanceMonitorInterceptor performanceMonitorInterceptor() {
        return new PerformanceMonitorInterceptor(true);
    }
	
	@Bean
    public ProjectRepositoryMethodInterceptor projectRepositoryMethodInterceptor() {
        return new ProjectRepositoryMethodInterceptor(true);
    }
	
	@Bean
    public Advisor projectRepositoryMethodAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("pl.coderslab.appConfig.AopConfiguration.monitor()");
        return new DefaultPointcutAdvisor(pointcut, projectRepositoryMethodInterceptor());
    }
	
	@Bean
    public Advisor performanceMonitorAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("pl.coderslab.appConfig.AopConfiguration.monitor()");
        return new DefaultPointcutAdvisor(pointcut, performanceMonitorInterceptor());
    }
*/	
}
