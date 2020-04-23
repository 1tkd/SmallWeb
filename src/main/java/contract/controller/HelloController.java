package contract.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import contract.controller.form.HelloForm;

@Controller
@EnableWebMvc
public class HelloController {
	@GetMapping(value = "/start", produces="text/html;charset=UTF-8")
	public String getStart(@ModelAttribute HelloForm helloForm) {

		return "startApp";
	}

	@RequestMapping(value = "/write", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String show(@ModelAttribute HelloForm helloForm, HttpServletRequest req) {
		helloForm.setVal2("form:"+(helloForm.getVal1()==null?"isNull":helloForm.getVal1()) + " req:"+req.getParameter("val1"));
		
		return "startApp";
	}

}
