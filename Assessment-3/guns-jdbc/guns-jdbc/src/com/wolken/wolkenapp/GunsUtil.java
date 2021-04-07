package com.wolken.wolkenapp;

import java.util.Scanner;


import com.wolken.wolkenapp.dto.GunsDTO;
import com.wolken.wolkenapp.service.GunsService;
import com.wolken.wolkenapp.service.GunsServiceImpl;

public class GunsUtil {
	public static void main(String[] args) {
		try {
			 Scanner scanner = new Scanner(System.in);
			 
			 GunsService gunsService = new GunsServiceImpl();
			 
			 GunsDTO gunsDTO = new GunsDTO();
			 
			
			System.out.println("enter gun id");
			//int gunsId = scanner.nextInt();
			gunsDTO.setGunsId(scanner.nextInt());
			System.out.println("enter gun name");
			gunsDTO.setName(scanner.next());
			
			System.out.println("enter gun price ");
			gunsDTO.setPrice(scanner.nextInt());
			System.out.println("enter gun serial number ");
			gunsDTO.setSerialNumber(scanner.nextInt());
			System.out.println("enter brand name ");
			gunsDTO.setBrandName(scanner.next());
			System.out.println("enter the type  ");
			gunsDTO.setType(scanner.next());
			System.out.println("enter the no of bullets ");
			gunsDTO.setNoOfBullets(scanner.nextInt());
			System.out.println("enter the made in country ");
			gunsDTO.setMadeIn(scanner.next());
			
			gunsService.validate(gunsDTO);
			
			gunsService.validateAndGet();
			System.out.println("enter the serial no ");
			int serialNumber = scanner.nextInt();
			System.out.println("enter the serial no ");
			int price = scanner.nextInt();
			gunsService.validateAndUpdate(serialNumber,price);
			
		   System.out.println("enter the brand name to get all by brandname");
			String brandName = scanner.next();
			gunsService.validateAndGetAllByBrandName(brandName);
			
			System.out.println("enter the country name to get all by countryname");
			String madeIn = scanner.next();
			gunsService.validateAndgetAllByCountryName(madeIn);
			
			System.out.println("enter the id to be deleted");
			int gunsId = scanner.nextInt();
			gunsService.validateAnddeleteByGunsId(gunsId);
			
		
           
			}finally {
			System.out.println("ended!");
		}
	}
		
}
	

