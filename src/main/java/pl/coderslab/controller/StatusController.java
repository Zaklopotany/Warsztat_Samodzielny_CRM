package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.repository.TaskStatusRepository;

@Controller
@RequestMapping("/status")
public class StatusController {
	
	@Autowired
	TaskStatusRepository statusRep;
	
	//show all status
	@GetMapping("/showStatusList")
	public String showAll(Model model) {
		model.addAttribute("statusList", statusRep.findAll());
		return "status/statusList";
	}
	
	//add new status (show form)
	@GetMapping("/addStatus")
	public String addNewStatus(Model model) {
		return "";
	}
	
	
}
