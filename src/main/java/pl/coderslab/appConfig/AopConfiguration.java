package pl.coderslab.appConfig;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import pl.coderslab.logger.ProjectRepositoryMethodInterceptor;

@Aspect
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "pl.coderslab")
public class AopConfiguration {
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
