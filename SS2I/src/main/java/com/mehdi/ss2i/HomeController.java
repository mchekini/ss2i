package com.mehdi.ss2i;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mehdi.DAO.DeveloppeurDAOImpl;
import com.mehdi.DAO.LangageDAOImpl;
import com.mehdi.beans.Developpeur;
import com.mehdi.beans.Langage;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		

		
		return "home";
	}
	
	
	
}
