package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.repository.TaskPriorityRepository;

@Controller
@RequestMapping("/priority")
public class PriorityController {
	@Autowired
	private TaskPriorityRepository priorityRep;
	
	//show all priorities
	@GetMapping("/showPriorityList")
	public String showAll(Model model) {
		model.addAttribute("priorityList", priorityRep.findAll());
		return "priority/priorityList";
	}
	
	
}
