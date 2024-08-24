package com.WebApplication.Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Controller
public class HomeController {
        @RequestMapping("/")
        @ResponseBody
		public String greet() {
			return "Welcome to SpringBoot Web Application ";
		}
        @RequestMapping("/about")
        public String about() {
			return "Welcome to about page in Web Application ";
		}

	}
