package com.mehdi.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mehdi.beans.Langage;
import com.mehdi.beans.Societe;
import com.mehdi.ss2i.HibernateUtil;

public class SocieteDAOImpl implements SocieteDAO{

	@Override
	public void add_societe(Societe s) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        session.save(s);
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
	public void delete_societe(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        Societe l = session.load(Societe.class, id);
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
	public Societe findSocietebyId(int id) {
		Societe s=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        s = session.get(Societe.class, id);
        session.delete(s);
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
		return s;
	}

	@Override
	public List<Societe> get_all_societes() {
		List<Societe> s = new ArrayList<Societe>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =null;
	try
	{
		tx = (Transaction) session.beginTransaction();
        s = session.createQuery("from Societe").list();
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
		return s;
	}

}
