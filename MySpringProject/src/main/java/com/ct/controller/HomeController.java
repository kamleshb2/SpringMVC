package com.ct.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ct.model.Customer;
import com.ct.model.Tv;

@Controller//implements Controller
public class HomeController {
	public HomeController() {
		System.out.println("obj created");
	}

	@RequestMapping("/")
	public String getHomepage() {
		System.out.println("in index");
		
		return "index";
	}
	
	Map<Integer, Tv> tv = new HashMap();
	static int count = 0;
	
	/*@RequestMapping("/register")
	public String getRegisterpage(Model m,HttpServletRequest req) {//auto created by container - model m
		String data="my register page";
		m.addAttribute("msg",data);//request
		req.setAttribute("myData","using http req ");
		ses.setAttribute("myData","using http req-session ");
		System.out.println("in render register");
		return "registerpage";//"redirect:path"
	}*/
	@RequestMapping("/register")
	public ModelAndView getRegisterpage() {//auto created by container - model m
		ModelAndView mv=new ModelAndView();
		mv.addObject("cust",new Customer());
		String data="my register page";
		mv.addObject("msg", data);
		mv.setViewName("registerpage");
		
		return mv;
	}	
	@RequestMapping("/singleView")
	public String  getSingleItem(@RequestParam("id") int id,@RequestParam("name")String name,@RequestParam("price") float price) {
		System.out.println(id+" "+name+" "+price);
		return "single";
	}
	@RequestMapping("/path/{id}")
	public String  getPathItem(@PathVariable("id") String id) {
		System.out.println(id);
		return "single";
	}
	//GetMapping & @PostMapping("register") - spring 5
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("cust") Customer customer) {
		System.out.println("in post register "+customer);
		return "index";
	}
	
	@RequestMapping("/add")
	public ModelAndView addTV() {
		ModelAndView ml = new ModelAndView();
		ml.addObject("tv", new Tv());
		String Message = "Add TV to the database";
		ml.addObject("message", Message);
		ml.setViewName("addpage");
		return ml;
	}
	
	@RequestMapping(value="/hashmapAdd",method=RequestMethod.POST)
	public String hashMapAdd(@ModelAttribute("tv") Tv t) {
		tv.put(count, t);
		count++;
		System.out.println(tv);
		return "index";
	}
	
	@RequestMapping("/display")
	public ModelAndView display() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("displayTv", tv);
		mv.setViewName("displayTv");
		return mv;
		
	}
	
	
}




