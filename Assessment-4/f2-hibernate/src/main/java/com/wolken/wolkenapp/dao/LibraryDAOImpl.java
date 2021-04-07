package com.wolken.wolkenapp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.wolkenapp.HibernateUtil;
import com.wolken.wolkenapp.dto.LibraryDTO;

public class LibraryDAOImpl implements LibraryDAO {
	Logger logger=Logger.getLogger("LibraryDAOImpl");
	
	LibraryDTO libraryDTO = new LibraryDTO();

	@Override
	public void createLibrary(LibraryDTO libraryDTO)  {
		// TODO Auto-generated method stub
		try {
			logger.info("*INFO* adding data");
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(libraryDTO);
		transaction.commit();
		session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateByBookName(String bookName, Integer price) {
		// TODO Auto-generated method stub
		try {
		  logger.info("*INFO* updating data");
		  Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.getNamedQuery("update"); 
		  query.setParameter("bn", bookName);
		  query.setParameter("pr", price);
		  Transaction transaction = session.beginTransaction();
		  query.executeUpdate(); 
		  transaction.commit();
		  session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Integer price) {
		// TODO Auto-generated method stub
		try {
		 Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.createQuery("delete from LibraryDTO lib where lib.price= "+price+" "); 
		 // query.setParameter("pr", price);
		  Transaction transaction = session.beginTransaction();
		  query.executeUpdate(); 
		  transaction.commit();
		  session.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<LibraryDTO> getAll() {
		// TODO Auto-generated method stub
	
		 Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.getNamedQuery("selectAll"); 
		  List<LibraryDTO> dtos = query.list(); 
		  dtos.forEach(System.out::print); 
		  session.close();
		 return dtos;
		}
}
	
	
		

