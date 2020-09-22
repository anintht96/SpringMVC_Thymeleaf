package spring.mvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

	@RequestMapping(value = "/")
	public ModelAndView index() {
		return new ModelAndView("index", "message", "hello");
	}
}
