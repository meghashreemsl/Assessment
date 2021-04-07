package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.ConsoleAppender;

import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.exception.MyException;
import com.wolken.wolkenapp.service.LibraryService;
import com.wolken.wolkenapp.service.LibraryServiceImpl;

@WebServlet("/update")
public class LibraryServlet1 extends HttpServlet {
	
	Logger logger=Logger.getLogger("LibraryServlet1");

	
	LibraryService libraryService = new LibraryServiceImpl();
	LibraryDTO libraryDTO = new LibraryDTO();
	
	public LibraryServlet1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String bookName = req.getParameter("book_name");
		String price = req.getParameter("book_price");
		Integer price1 = Integer.parseInt(price);
	
		
		try {
			libraryService.ValidateAndUpdate(bookName, price1);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("*INFO* updating data");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("updated succesfully");

		printWriter.flush();
		printWriter.close();
		
	}

}