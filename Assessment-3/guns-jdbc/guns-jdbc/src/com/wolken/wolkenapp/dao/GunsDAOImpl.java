package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wolken.wolkenapp.connection.Connect;
import com.wolken.wolkenapp.dto.GunsDTO;

public class GunsDAOImpl implements GunsDAO {
	
	public 	Connection con = Connect.getConnect();

	@Override
	public GunsDTO add(GunsDTO gunsDTO) throws SQLException {
		// TODO Auto-generated method stub
	
		try () {

			preparedStatements.setInt(1, gunsDTO.getGunsId());
			preparedStatements.setString(2, gunsDTO.getName());
			preparedStatements.setInt(3, gunsDTO.getPrice());
			preparedStatements.setInt(4, gunsDTO.getSerialNumber());
			preparedStatements.setString(5, gunsDTO.getBrandName());
			preparedStatements.setString(6, gunsDTO.getType());
			preparedStatements.setInt(7, gunsDTO.getNoOfBullets());
			preparedStatements.setString(8, gunsDTO.getMadeIn());
			preparedStatements.executeUpdate();
			preparedStatements.close();
		}
		con.close();
		return gunsDTO;
	}

	@Override
	public void getAll() throws SQLException {
		// TODO Auto-generated method stub
		try () {
			try (ResultSet rs = statement.executeQuery("select * from jdbc.guns_table")) {

				while (rs.next()) {
					int gunsId = rs.getInt("guns_id");
					String Name = rs.getString("gun_name");
					int price = rs.getInt("gun_price");
					int SerialNumber = rs.getInt("serial_number");
					String BrandName = rs.getString("brand_name");
					String Type = rs.getString("gun_type");
					int NoOfBullets = rs.getInt("no_of_bullets");
					String MadeIn = rs.getString("made_in");
					
					System.out.println("get all details");
					System.out.println(gunsId + " " +
					Name + " " +
							price + " "+
					SerialNumber+" "+
							BrandName+" "+
							Type+" "+
							NoOfBullets+" "+MadeIn);
				}
				//rs.close();
			}
		}
		con.close(); 

	}

	@Override
	public void updateBySerialNumber(int serialNumber, int price) throws SQLException {
		// TODO Auto-generated method stub
		try () {
			System.out.println("update");
			pre.setInt(1, price);
			pre.setInt(2, serialNumber);
			pre.executeUpdate();
			System.out.println("details updated ");
			pre.close();
		}
		con.close();
		}
	

	@Override
	public void getAllByBrandName(String brandName) throws SQLException {
		// TODO Auto-generated method stub
		try (Statement statement = con.createStatement()) {
			try (ResultSet rs = statement.executeQuery("select * from jdbc.guns_table where brand_name=?")) {

				while (rs.next()) {
					int gunsId = rs.getInt("guns_id");
					String Name = rs.getString("gun_name");
					int price = rs.getInt("gun_price");
					int SerialNumber = rs.getInt("serial_number");
					String BrandName = rs.getString("brand_name");
					String Type = rs.getString("gun_type");
					int NoOfBullets = rs.getInt("no_of_bullets");
					String MadeIn = rs.getString("made_in");
					
					
					System.out.println(gunsId + " " +
					Name + " " +
							price + " "+
					SerialNumber+" "+
							BrandName+" "+
							Type+" "+
							NoOfBullets+" "+MadeIn);
				}
				//rs.close();
			}
		}
		con.close(); 

	}

	@Override
	public void getAllByCountryName(String madeIn) throws SQLException {
		// TODO Auto-generated method stub
		try ( {

				while (rs.next()) {
					int gunsId = rs.getInt("guns_id");
					String Name = rs.getString("gun_name");
					int price = rs.getInt("gun_price");
					int SerialNumber = rs.getInt("serial_number");
					String BrandName = rs.getString("brand_name");
					String Type = rs.getString("gun_type");
					int NoOfBullets = rs.getInt("no_of_bullets");
					String MadeIn = rs.getString("made_in");
					
					
					System.out.println(gunsId + " " +
					Name + " " +
							price + " "+
					SerialNumber+" "+
							BrandName+" "+
							Type+" "+
							NoOfBullets+" "+MadeIn);
				}
				//rs.close();
			}
		}
		con.close(); 

	}

	@Override
	public GunsDTO deleteByGunsId(int gunsId) throws SQLException {
		// TODO Auto-generated method stub
		try () {
			System.out.println("delete");
			pre.setInt(1, gunsId);
			pre.executeUpdate();
			System.out.println("details deleted ");
			pre.close();
		}
		con.close();
		return null;
	}

}
