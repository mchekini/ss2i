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

import com.mehdi.beans.Developpeur;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
		
		try
		{
			tx = (Transaction) session.beginTransaction();

		
			
	
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			if (tx != null) {
			    tx.rollback();
			}
		}
		finally {
			session.close();
		}
		
		return "home";
	}
	
}
