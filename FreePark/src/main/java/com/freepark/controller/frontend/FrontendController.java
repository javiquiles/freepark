package com.freepark.controller.frontend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.freepark.controller.backend.HomeController;
import com.freepark.service.impl.PlayaServiceImpl;

@Controller
@RequestMapping("frontend/")
public class FrontendController {
	private final static String URL_INDEX = "frontend/index";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private PlayaServiceImpl playaService;

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("playa", playaService.findById((long) 21));
		return URL_INDEX;
	}

}
