package com.mehdi.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mehdi.beans.Developpeur;
import com.mehdi.beans.Societe;
import com.mehdi.ss2i.HibernateUtil;

public class DeveloppeurDAOImpl implements DeveloppeurDAO {

	@Override
	public void add_Developpeur(Developpeur d) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        session.save(d);
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
	public void delete_developpeur(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        Developpeur d = session.get(Developpeur.class, id);
        session.delete(d);
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
	public Developpeur findDeveloppeurbyId(int id) {
		Developpeur d=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        d = (Developpeur)session.get(Developpeur.class, id);
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
		return d;
	}

	@Override
	public List<Developpeur> get_all_developpeurs() {
		List<Developpeur> d = new ArrayList<Developpeur>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        d = (List<Developpeur>) session.createQuery("from Developpeur").list();
        
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
		return d;
	}

}
