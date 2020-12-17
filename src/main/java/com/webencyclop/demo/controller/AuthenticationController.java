package com.webencyclop.demo.controller;

import com.webencyclop.demo.security.SecurityConfiguration;
import com.webencyclop.demo.service.UserInfo;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {

	@RequestMapping(value = { "/showimg" }, method = RequestMethod.GET)
	public ModelAndView showimg() {
		ModelAndView modelAndView = new ModelAndView("showimg");
		return modelAndView;
	}

	@RequestMapping(value = { "/pagination" }, method = RequestMethod.GET)
	public ModelAndView pagination() {
		ModelAndView modelAndView = new ModelAndView("pagination");
		return modelAndView;
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}

	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public ModelAndView logout() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("logout");
		return modelAndView;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		return modelAndView;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}

	@RequestMapping(value = "/employee/approved", method = RequestMethod.GET)
	public ModelAndView employeeApproved() {
		ModelAndView modelAndView = new ModelAndView("employee/approved", "username", UserInfo.getUsername());
		return modelAndView;
	}

	@RequestMapping(value = "/employee/approving", method = RequestMethod.GET)
	public ModelAndView employeeApproving() {
		ModelAndView modelAndView = new ModelAndView("employee/approving", "username", UserInfo.getUsername());
		return modelAndView;
	}

	@RequestMapping(value = "/employee/upload", method = RequestMethod.GET)
	public ModelAndView employeeUpload() {
		ModelAndView modelAndView = new ModelAndView("employee/upload", "username", UserInfo.getUsername());
		return modelAndView;
	}

	@RequestMapping(value = "/superior/approve", method = RequestMethod.GET)
	public ModelAndView superiorApprove() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("superior/approve");
		return modelAndView;
	}

	@RequestMapping(value = "/superior/approve-action", method = RequestMethod.GET)
	public ModelAndView superiorApproveAction() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("superior/approve-action");
		return modelAndView;
	}

	@RequestMapping(value = "/superior/approved_", method = RequestMethod.GET)
	public ModelAndView superiorApproved_() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("superior/approved_");
		return modelAndView;
	}

	@RequestMapping(value = "/superior/approving_", method = RequestMethod.GET)
	public ModelAndView superiorApproving_() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("superior/approving_");
		return modelAndView;
	}


}
