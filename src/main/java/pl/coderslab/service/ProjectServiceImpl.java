package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pl.coderslab.entity.Projects;
import pl.coderslab.entity.TaskStatus;
import pl.coderslab.entity.Tasks;
import pl.coderslab.repository.ProjectsRepository;
import pl.coderslab.repository.TasksRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectsRepository projectRep;
	@Autowired
	TasksRepository taskRep;

	public ProjectServiceImpl() {
		super();
	}

	@Override
	public void addNewProject(Projects project) {
		projectRep.save(project);
	}

	@Override
	public void addNewTask(Tasks task) {
		taskRep.save(task);
	}

	@Override
	public void changeTaskStatus(Tasks task, TaskStatus status) {
		task.setTaskStatus(status);
		taskRep.save(task);
	}

}
