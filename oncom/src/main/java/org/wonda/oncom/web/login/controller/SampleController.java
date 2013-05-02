package org.wonda.oncom.web.login.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wonda.oncom.web.login.form.LoginForm;

/**
 * 
 * @author Koyo Onda
 */
@Controller
public class SampleController {
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model) {
		System.out.println("Hello Controller");
		model.addAttribute("login", new LoginForm());
		return "index";
	}
	
	/**
	 * 
	 * @param loginBean
	 * @return
	 */
	@RequestMapping(value="login")
	public String login(
			@Valid
			LoginForm login, Errors errors, Model model) {
		System.out.println("Hello Login");
		System.out.println(errors.getAllErrors()); // TODO
		model.addAttribute("login", login);
		if (errors.hasErrors()) {
			System.out.println("has errors!");
			return "index";
		}
		return "index";
	}
	
	
}
