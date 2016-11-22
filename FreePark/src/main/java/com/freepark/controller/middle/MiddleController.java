package com.freepark.controller.middle;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.freepark.controller.frontend.FrontendController;
import com.freepark.service.impl.PlayaServiceImpl;

@Controller
@RequestMapping("middle/")
public class MiddleController {
	private final static String URL_INDEX = "middle/index";
	private static final Logger logger = LoggerFactory.getLogger(FrontendController.class);
	
	@Autowired
	private PlayaServiceImpl playaService;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("playa", playaService.findById((long) 21));
		return URL_INDEX;
	}
}
