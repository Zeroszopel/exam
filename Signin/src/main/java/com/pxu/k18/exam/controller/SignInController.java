package com.pxu.k18.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pxu.k18.exam.model.Account;
import com.pxu.k18.exam.service.AccountService;
@Controller
public class SignInController {
@Autowired
public AccountService accountService;
	@GetMapping({"/","/login"}) 
	  public ModelAndView login(){
	  ModelAndView modelAndView = new ModelAndView("login");
    modelAndView.addObject("account", new Account());
    return modelAndView;
	  }
	  @PostMapping(value = "/login") 
	  public ModelAndView check(@ModelAttribute("account") Account account){
		int check = this.accountService.findAccount(account);
		  if(check >0) {
			  ModelAndView modelAndView = new ModelAndView("loginsuccess");
		        modelAndView.addObject("name",accountService.findById(check).getName());
		        modelAndView.addObject("message", "Bạn đã đăng nhập thành công");
			  return modelAndView;
		  }else {
			  ModelAndView modelAndView = new ModelAndView("login");
		        modelAndView.addObject("account", new Account());
		        modelAndView.addObject("message", "Tên đăng nhập hoặc mật khẩu không tồn tại");
			  return modelAndView;
		  }
	  }
	  
}
