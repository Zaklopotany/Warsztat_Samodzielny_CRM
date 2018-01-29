package pl.coderslab.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.beans.Encoding;
import pl.coderslab.entity.Users;
import pl.coderslab.repository.UsersRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UsersRepository userRep;

	// show all users
	@GetMapping("/showUserList")
	public String showAll(Model model) {
		model.addAttribute("userList", userRep.findAll());
		return "user/userList";
	}

	// Login ============ Logout ==========
	// --------------------------------======---------------------------------------
	
	// display login window
	@GetMapping(path = "/login")
	public String showLoginForm() {
		return "app/login";
	}

	// login form, get user - authentication
	@PostMapping(path = "/login")
	public String processLoginRequest(@RequestParam("login1") String login, @RequestParam("password") String password,
			Model model, HttpSession ses) {
		Users user = userRep.findOneByLoginAndPassword(login, Encoding.encodePassToString(password));
		if (user != null) {
			ses.setAttribute("user", user);
			return "redirect:/project/showMainPage";
		} else {
			return "app/login";
		}
	}

	// display register window
	@GetMapping(path = "/register")
	public String showRegisterForm(Model model) {
		model.addAttribute("user", new Users());
		return "app/register";
	}

	// get new user (register form)
	@PostMapping(path = "/register")
	public String processRegistartionRequest(@Valid Users user, BindingResult bresult, Model model) {
		if (bresult.hasErrors()) {
			return "app/register";
		}
		userRep.save(user);
		return "redirect:/user/login";
	}

	// logout user
	@GetMapping("/logout")
	public String logoutUser(HttpSession ses) {
		ses.setAttribute("user", null);
		return "redirect:/user/login";
	}
}
