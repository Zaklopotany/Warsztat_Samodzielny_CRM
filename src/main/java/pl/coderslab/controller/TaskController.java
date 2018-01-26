package pl.coderslab.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import pl.coderslab.entity.Tasks;
import pl.coderslab.repository.ProjectsRepository;
import pl.coderslab.repository.TaskPriorityRepository;
import pl.coderslab.repository.TaskStatusRepository;
import pl.coderslab.repository.TasksRepository;

@Controller
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TasksRepository taskRep;
	@Autowired
	private ProjectsRepository projectRep;
	@Autowired
	private TaskPriorityRepository priorityRep;
	@Autowired
	private TaskStatusRepository statusRep;
	
	//show task list of project
	@GetMapping("/showProjectTasks/{id}")
	public String showTaskList(@PathVariable Long id, Model model) {
		model.addAttribute("taskList", taskRep.findByProjectsId(id));
		
		return "tasks/projectTaskList";
	}
	
	//show all tasks
	@GetMapping("/showAllTasks")
	public String showAllTask(Model model) {
		model.addAttribute("taskList", taskRep.findByOrderByCreatedDesc());
		return "tasks/allTasks";
	}
	
	//show task details
	@GetMapping("/showTaskDetails/{id}")
	public String showDetails(@PathVariable Long id, Model model) {
		model.addAttribute("task", taskRep.findOne(id));		
		return"tasks/taskDetails";
	}
	
	
	//create new task(show form)
	@GetMapping("/add")
	public String addNewTask(Model model) {
		model.addAttribute("task", new Tasks());
		model.addAttribute("projectList", projectRep.findAll());
		model.addAttribute("priorityList", priorityRep.findByActivity(true));
		model.addAttribute("statusList", statusRep.findByActivity(true));
		
		return "tasks/addTask";
	}
	
	@PostMapping("/add")
	public String saveMessage(@Valid Tasks task, BindingResult result) {
		if(result.hasErrors()) {
			return "tasks/addTask";
		}
		//dodać usera i savowanie
//		taskRep.save(task);
		return "redirect:/task/showAllTasks";
	}
}
