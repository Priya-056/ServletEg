package com.sonata.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class FormController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showForm() {
		ModelAndView mv=new ModelAndView("form");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView handleForm(@RequestParam("mail")String mail,@RequestParam("name") String name,@RequestParam("pass") String pass) {
		
		ModelAndView mv=new ModelAndView("display");
		mv.addObject("msg","Details submitted by you is Email id: "+ mail +", Name: "+ name +", Password: "+ pass);
		
		return mv;
		}
}
