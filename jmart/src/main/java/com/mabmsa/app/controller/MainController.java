package com.mabmsa.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mabmsa.app.model.User;
import com.mabmsa.app.service.UserService;

@Controller
public class MainController {

	private UserService userService;

	@GetMapping("/user")
	public String user() {
		return ("<h1> Welcome to user page</h1>");

	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1> Welcome to user page</h1>");

	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	// display list of Users
	@GetMapping("/")
	public String viewHomePage(Model model) {
//		return findPaginated(1, "firstName", "asc", model);
		return "index";
	}

	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, @RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir, Model model) {
		int pageSize = 10;

		Page<User> page = userService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<User> listUsers = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());

		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("listUsers", listUsers);
		return "index";
	}

	@RequestMapping(value = "/saveUser", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String saveUser(User user) {
		// save User to database
		userService.saveUser(user);
		return "redirect:/";
	}

	@RequestMapping(value = "/updateUser", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String updateUser(User user) {
		// save User to database
		userService.updateUser(user);
		return "/showNewUserForm";
	}

	@GetMapping(value = "/getUser")
	@ResponseBody
	public Optional<User> getUser(Integer Id, Model model) {
		Optional<User> user = userService.getUser(Id);
		return user;
	}

}