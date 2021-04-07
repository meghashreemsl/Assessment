package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.exception.MyException;

public interface LibraryService {
	
	public void ValidateAndSave(LibraryDTO libraryDTO) throws MyException;
	public void ValidateAndUpdate(String bookName,Integer price) throws MyException;
	public void ValidateAndDelete(Integer price1) throws MyException;
	List<LibraryDTO> getAll();
	

}
