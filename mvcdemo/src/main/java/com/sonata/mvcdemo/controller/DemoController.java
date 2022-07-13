package com.sonata.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class DemoController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap modelmap) {
		modelmap.addAttribute("msg1","Hello Priya!!");
		return "mypage1";
	}

	@RequestMapping(value="/sayhello",method = RequestMethod.GET)
	public ModelAndView hello1() {
		ModelAndView mv=new ModelAndView("mypage2");
		mv.addObject("msg1","hello world");
		return mv;
	}
	
	@RequestMapping("/login")
	public String validateuser(@RequestParam("username")String username, @RequestParam("pass") String pass, Model model) {
		model.addAttribute("username",username);
		model.addAttribute("pass", pass);
		return "home";
	}
	
	@RequestMapping("/index")
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping("/path/{name}/{id}")
	public String pathDemo(@PathVariable String name,@PathVariable int id,Model model) {
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		return "path";
	}
	

}
