package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.repository.UsersRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UsersRepository userRep;
	
	//show all users
	@GetMapping("/showUserList")
	public String showAll(Model model) {
		model.addAttribute("userList", userRep.findAll());
		return "user/userList";
	}
}
