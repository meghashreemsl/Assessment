package com.wolken.wolkenapp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.ConsoleAppender;

import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.service.LibraryService;
import com.wolken.wolkenapp.service.LibraryServiceImpl;


@WebServlet("/display")
public class LibraryServlet3 extends HttpServlet  {
	
	Logger logger=Logger.getLogger("LibraryServlet3");
	
public LibraryServlet3() {
	// TODO Auto-generated constructor stub
}

		LibraryService libraryService = new LibraryServiceImpl();
		LibraryDTO libraryDTO = new LibraryDTO();
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			logger.info("*INFO****** GETALL *****");
			List<LibraryDTO> libraryList = libraryService.getAll();

			req.setAttribute("libraryList", libraryList);

			RequestDispatcher dispatcher = req.getRequestDispatcher("getall.jsp");
			dispatcher.forward(req, resp);

}
	}

