package com.mehdi.ss2i;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mehdi.DAO.LangageDAOImpl;

public class DAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("debut des tests");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("fin des tests");
	}

	@Test
	public void test() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		LangageDAOImpl l = new LangageDAOImpl();
		assertTrue(l.get_all_langages().size()==7);
		
	}

}
