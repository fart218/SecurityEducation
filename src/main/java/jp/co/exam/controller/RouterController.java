package jp.co.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RouterController {
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/authControlLogin")
	public String authControlLogin() {
		return "authControlLogin";
	}

	@GetMapping("/noLockOutLogin")
	public String noLockOutLogin() {
		return "noLockOutLogin";
	}

	@GetMapping("/securityLogin")
	public String securityLogin() {
		return "securityLogin";
	}

	@GetMapping("/errorPage")
	public ModelAndView errorPage(@RequestParam("code") int code) {
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("errorPage");
	    mav.addObject("code", code);
	    return mav;
	}
}
