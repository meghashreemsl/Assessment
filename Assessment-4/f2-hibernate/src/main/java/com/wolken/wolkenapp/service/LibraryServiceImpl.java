package com.wolken.wolkenapp.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.dao.LibraryDAO;
import com.wolken.wolkenapp.dao.LibraryDAOImpl;
import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.exception.MyException;

public class LibraryServiceImpl implements LibraryService {
	
	Logger logger=Logger.getLogger("LibraryServiceImpl");
	
	LibraryDAO dao = new LibraryDAOImpl();
	//LibraryService libraryService = new LibraryServiceImpl();

	@Override
	public void ValidateAndSave(LibraryDTO libraryDTO) throws MyException {
		// TODO Auto-generated method stub
	try {
		logger.info("validating and saving data");
		if(libraryDTO.getBookId()>0) {
			if(libraryDTO.getBookName()!=null) {
				if(libraryDTO.getPrice()>0) {
					if(libraryDTO.getAuthor()!=null) {
						dao.createLibrary(libraryDTO);
						
					}else {
						//System.out.println("bookname is invalid");
						logger.debug("*DEBUG* bookauthor is invalid");
			
					}
					
				}else{
					//System.out.println("bookname is invalid");
					logger.debug("*DEBUG* bookprice is invalid");
				}
			}
			else {
				//System.out.println("bookname is invalid");
				logger.debug("*DEBUG* bookname is invalid");
			}
			
		}
		else
		{
			//System.out.println("book id is invalid");
			logger.debug("*DEBUG* bookid is invalid");
		}
	}catch(Exception e) {
		e.printStackTrace();
		throw new MyException();
	}

	}

	@Override
	public void ValidateAndUpdate(String bookName, Integer price) throws MyException {
		// TODO Auto-generated method stub
		try {
		if(price>0) {
			if(bookName!=null) {
				
				dao.updateByBookName(bookName, price);
			}
			else {
				logger.debug("*DEBUG* bookname is invalid");
				//System.out.println("book name is not valid");
			}
		}
		else {
			logger.debug("*DEBUG* price is invalid");
			//System.out.println("price is not valid");
		}
	}catch(Exception e) {
	
		e.printStackTrace();
		throw new MyException();
	}
	}


	@Override
	public void ValidateAndDelete(Integer price1) throws MyException {
		// TODO Auto-generated method stub
		try {
		if(price1>0) {
			dao.delete(price1);
		}
		else {
			logger.debug("*DEBUG* price is invalid");
			//System.out.println("price is not valid");
			throw new MyException();
		
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		throw new MyException();
	}
	}

	@Override
	public List<LibraryDTO> getAll() {
		// TODO Auto-generated method stub
		
		return dao.getAll();
	}

}
