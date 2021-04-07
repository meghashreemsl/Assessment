package com.wolken.wolkenapp.dto;

public class GunsDTO {
	
	private int gunsId;
	private String name;
	private int price;
	private int serialNumber;
	private String brandName;
	private String type;
	private int NoOfBullets;
	private String madeIn;
	
	public GunsDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor object is created ");
	}

	public int getGunsId() {
		return gunsId;
	}

	public void setGunsId(int gunsId) {
		this.gunsId = gunsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfBullets() {
		return NoOfBullets;
	}

	public void setNoOfBullets(int noOfBullets) {
		NoOfBullets = noOfBullets;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	
	
	

}
