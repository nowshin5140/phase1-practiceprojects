package com.example.demo;

import java.util.logging.Logger;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class EmployeeController {
@Autowired
EmpRepo repo;

Logger log=Logger.getAnonymousLogger();

@RequestMapping("/")
public ModelAndView loadpage(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("login.jsp");
	log.info("login page loaded");
	return mv;
}


@RequestMapping("/login")
public ModelAndView loginaction(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	String user=request.getParameter("user");
	String pwd=request.getParameter("pwd");
	log.info("login request user and pwd ");
	Employee ee=repo.findByuserpwd(user, pwd);
	if(ee!=null) {
	mv.setViewName("display.jsp");
	log.info("went to display");
	mv.addObject("emp",ee);
	}
	else {
		
		mv.setViewName("fail.jsp");
		log.info("went to fail.jsp");
	}
	return mv;
}

@ResponseBody
@RequestMapping("/registermslogin")
public String regsitermslogin(HttpServletRequest request,HttpServletResponse response) {
	//home assignment to have a model and view for this to go to a jsp page
	log.info("registermslogin request loaded");
	String user =request.getParameter("user");
	String password=request.getParameter("pwd");
	String email=request.getParameter("email");
	//Rest API
	RestTemplate rest=new RestTemplate();
	String url="http://localhost:8089/register-user/"+user+"/"+password+"/"+email;
	log.info(url);
	rest.getForObject(url, String.class);
	return "registration is successfull";
}

	
	
}



