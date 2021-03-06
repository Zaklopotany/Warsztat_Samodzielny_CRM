package pl.coderslab.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import pl.coderslab.entity.Activity;
import pl.coderslab.entity.Projects;
import pl.coderslab.entity.Users;
import pl.coderslab.repository.ActivityRepository;
import pl.coderslab.repository.ProjectsRepository;
import pl.coderslab.repository.TasksRepository;
import pl.coderslab.repository.UsersRepository;
import pl.coderslab.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectsController {

	@Autowired
	ProjectsRepository projectsRep;
	@Autowired
	ActivityRepository activRep;
	@Autowired
	TasksRepository taskRep;
	@Autowired
	UsersRepository usersRep;
	
	@Autowired
	ProjectService PSI;

	@ModelAttribute(name = "activityList")
	public List<Activity> getActivitiesList() {
		return activRep.findTop25ByOrderByCreatedDesc();
	}

	// collecting all data to display on main page
	@GetMapping("/showMainPage")
	public String getTopProjects(Model model) {
		List<Projects> projectList = new ArrayList<>();
		List<Activity> activityList = new ArrayList<>();

		projectList = projectsRep.findTop5ByOrderByCreatedDesc();
		activityList = activRep.findTop25ByOrderByCreatedDesc();

		projectList = projectList.stream().map(s -> s = s.setUsersNumber(projectsRep.countingByProjectId(s.getId())))
				.map(s -> s.setTasksNumber(taskRep.countingByProjectId(s.getId()))).map(s -> {
					if (s.getDescription().length() > 150) {
						return s.setDescription(s.getDescription().substring(0, 150) + ".......");
					} else {
						return s;
					}
				}).collect(Collectors.toList());

		model.addAttribute("activityList", activityList);
		model.addAttribute("projectList", projectList);
		return "app/mainPage";
	}

	// collecting all data to display on main page
	@GetMapping("/showProjectList")
	public String getProjectList(Model model) {
		List<Projects> projectList = new ArrayList<>();
		projectList = projectsRep.findAll();
		model.addAttribute("projectList", projectList);
		return "project/projectList";
	}
	//show project details
	@GetMapping("/showProjectDetails/{id}")
	public String getProjectList(Model model, @PathVariable Long id) {
		Projects tempProject = projectsRep.findOne(id);
		tempProject.setTasksNumber(taskRep.countingByProjectId(tempProject.getId()));
		tempProject.setUsersNumber(projectsRep.countingByProjectId(tempProject.getId()));
		
		model.addAttribute("usersList", usersRep.getProjectUsers(id));
		model.addAttribute("project", tempProject);
		return "project/projectDetails";
	}

	//add new project (redirect to from)
	@GetMapping("/add")
	public String addProject(Model model) {
		model.addAttribute("project", new Projects());
		return "project/addProject";
	}
	
	//add new project get data,validate,save
	@PostMapping("/add")
	public String saveProject(@Valid Projects project, BindingResult result, @SessionAttribute("user") Users user) {
		if(result.hasErrors()) {
			return "project/addProject";
		}
		project.setCreator(user);
		PSI.addNewProject(project);
		return "redirect:/proejct/showProjectList";
	}
}
