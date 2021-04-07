package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.GunsDTO;

public interface GunsService {
	 public void  validate(GunsDTO gunsDTO);
	 public void validateAndGet();
	 public void validateAndUpdate(int serialNumber,int price);
	 public void validateAndGetAllByBrandName(String brandName);
	 public void validateAndgetAllByCountryName(String madeIn);
	 public void validateAnddeleteByGunsId(int gunsId);

}
