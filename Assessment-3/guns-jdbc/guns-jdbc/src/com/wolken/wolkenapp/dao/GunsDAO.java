package com.wolken.wolkenapp.dao;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.GunsDTO;

public interface GunsDAO {
	public GunsDTO add(GunsDTO gunsDTO) throws SQLException;
	public void getAll() throws SQLException;
	public void updateBySerialNumber(int serialNumber,int price) throws SQLException;
	public void getAllByBrandName(String brandName) throws SQLException;
	public void getAllByCountryName(String madeIn)throws SQLException;
	public GunsDTO deleteByGunsId(int gunsId) throws SQLException;

}
