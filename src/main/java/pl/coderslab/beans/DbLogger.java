package pl.coderslab.beans;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import pl.coderslab.entity.Projects;
import pl.coderslab.entity.TaskStatus;
import pl.coderslab.entity.Tasks;

@Component
public class DbLogger implements Logger {
	private static final String ACTIVITY_PROJECT_HEADER = "";
	private static final String ACTIVITY_TASK_HEADER = "";
	private static final String ACTIVITY_STATU_HEADER = "";
	


	@Override
	public void log(HttpSession session, Object object) {
	if (object instanceof Projects) {
			
		} else if (object instanceof Tasks) {
			
		} else if (object instanceof TaskStatus) {
			
		}
		
		// TODO Auto-generated method stub

	}



}
