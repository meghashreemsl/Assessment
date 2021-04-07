package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.LibraryDTO;



public interface LibraryDAO {
	public void createLibrary(LibraryDTO libraryDTO);
	 public void updateByBookName(String bookName,Integer price);
	 public void delete(Integer price1);
	  public  List<LibraryDTO> getAll();


}
