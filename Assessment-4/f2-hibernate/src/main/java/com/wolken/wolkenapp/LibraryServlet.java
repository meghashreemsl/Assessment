package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;

import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.exception.MyException;
import com.wolken.wolkenapp.service.LibraryService;
import com.wolken.wolkenapp.service.LibraryServiceImpl;

@WebServlet("/add")
public class LibraryServlet extends HttpServlet{
	
	Logger logger=Logger.getLogger("LibraryServlet");
	
	public LibraryServlet() {
		// TODO Auto-generated constructor stub
	}
LibraryService libraryService = new LibraryServiceImpl();
LibraryDTO libraryDTO = new LibraryDTO();

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 String bookId = req.getParameter("book_id");
	 Integer bookId1 = Integer.parseInt(bookId);
	String bookName = req.getParameter("book_name");
	String price = req.getParameter("book_price");
	Integer price1 = Integer.parseInt(price);
	String author = req.getParameter("book_author");
	
	libraryDTO.setBookId(bookId1);
	libraryDTO.setBookName(bookName);
	libraryDTO.setPrice(price1);
	libraryDTO.setAuthor(author);
	
	
	try {
		libraryService.ValidateAndSave(libraryDTO);
	} catch (MyException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

	logger.trace("*******TRACE***********");
	
	PrintWriter printWriter = resp.getWriter();
	printWriter.print("saved successfully");

	printWriter.flush();
	printWriter.close();

	//super.doGet(req, resp);
}
}
