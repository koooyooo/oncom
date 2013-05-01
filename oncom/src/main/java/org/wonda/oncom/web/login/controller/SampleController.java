package org.wonda.oncom.web.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wonda.oncom.web.login.form.LoginForm;

/**
 * 
 * @author onko_archenemy
 *
 */
@Controller
public class SampleController {
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/displogin", method=RequestMethod.GET)
	public String show(Model model) {
		System.out.println("Hello Controller");
		model.addAttribute("login", new LoginForm());
		return "index";
	}
	
	
}
