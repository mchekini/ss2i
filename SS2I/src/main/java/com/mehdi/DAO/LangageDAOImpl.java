package com.mehdi.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mehdi.beans.Langage;
import com.mehdi.ss2i.HibernateUtil;

public class LangageDAOImpl implements LangageDAO {

	
	
	@Override
	public void add_langage(Langage l) {
		Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx =null;
		try
		{
			tx = (Transaction) session.beginTransaction();
            session.save(l);
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
	}

	@Override
	public void delete_langage(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        Langage l = session.load(Langage.class, id);
        session.delete(l);
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
		
	}

	@Override
	public Langage findlangagebyId(int id) {
		Langage l=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        l = session.get(Langage.class, id);
        session.delete(l);
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
		return l;
	}

	@Override
	public List<Langage> get_all_langages() {
		List<Langage> l = new ArrayList<Langage>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        l = session.createQuery("from Langage").list();
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
		return l;
	}

}
