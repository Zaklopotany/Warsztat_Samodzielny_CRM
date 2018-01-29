package pl.coderslab.service;

import pl.coderslab.entity.Projects;
import pl.coderslab.entity.TaskStatus;
import pl.coderslab.entity.Tasks;

public interface ProjectService {
	
	
	void addNewProject(Projects project);
	
	void addNewTask(Tasks task);
	 
	void changeTaskStatus(Tasks task, TaskStatus status);
	
}
