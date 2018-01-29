package pl.coderslab.beans.logger;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.coderslab.entity.Activity;
import pl.coderslab.entity.Projects;
import pl.coderslab.entity.Tasks;
import pl.coderslab.entity.Users;
import pl.coderslab.repository.ActivityRepository;

@Aspect
@Component
public class LoggingAspect {
	private static final String TASK_LOG_HEADER = "NEW TASK";
	private static final String PROJECT_LOG_HEADER = "NEW PROJECT";
	private static final String STATUS_LOG_HEADER = "TASK STATUS CHANGE";

	@Autowired
	private ActivityRepository activRep;

	@Autowired
	private HttpSession session;

	@Pointcut("execution( * pl.coderslab.service.ProjectServiceImpl.addNewTask(..))")
	public void newTask() {
	}

	@Pointcut("execution( * pl.coderslab.service.ProjectServiceImpl.addNewProject(..))")
	public void newProject() {
	}

	@Pointcut("execution( * pl.coderslab.service.ProjectServiceImpl.changeTaskStatus(..))")
	public void statusChange() {
	}

	/*
	 * //execution(* org.springframework.data.repository.CrudRepository+.save(*))
	 * execution(* org.springframework.data.repository.CrudRepository+.save(..))
	 * pl.coderslab..*
	 *
	 * //within(pl.coderslab..*)
	 */
	
	
	//refactoring!!!!! : ( 

	// new Task log
	@After("newTask()")
	public void logNewTaskCall(JoinPoint jp) {
		Users tempUser = (Users) session.getAttribute("user");
		Object[] obj = jp.getArgs();
		if (obj[0] instanceof Tasks) {
			activRep.save(new Activity()
					.setHeader(TASK_LOG_HEADER)
					.setUser(tempUser)
					.setTasks((Tasks) obj[0]));
		}
	}

	// new Project log
	@After("newProject()")
	public void logNewProjectCall(JoinPoint jp) {
		Users tempUser = (Users) session.getAttribute("user");
		Object[] obj = jp.getArgs();
		if (obj[0] instanceof Projects) {
			activRep.save(
					new Activity()
					.setHeader(PROJECT_LOG_HEADER)
					.setUser(tempUser)
					.setProjects((Projects) obj[0]));
		}
	}

	// status change log
	@After("statusChange()")
	public void logStatusChangeCall(JoinPoint jp) {
		Users tempUser = (Users) session.getAttribute("user");

		Object[] obj = jp.getArgs();
		if (obj[0] instanceof Tasks) {
			activRep.save(new Activity()
					.setHeader(STATUS_LOG_HEADER)
					.setUser(tempUser)
					.setProjects(((Tasks) obj[0]).getProjects())
					.setTasks((Tasks) obj[0])
					.setDescription(((Tasks) obj[0]).getTaskStatus().getName()));
		}
	}

}
