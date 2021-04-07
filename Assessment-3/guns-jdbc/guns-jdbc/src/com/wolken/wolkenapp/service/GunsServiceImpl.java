package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dao.GunsDAO;
import com.wolken.wolkenapp.dao.GunsDAOImpl;
import com.wolken.wolkenapp.dto.GunsDTO;

public class GunsServiceImpl implements GunsService {
	
	GunsDAO gunsDAO = new GunsDAOImpl();
	GunsDTO gunsDTO = new GunsDTO();

	@Override
	public void validate(GunsDTO gunsDTO) {
		// TODO Auto-generated method stub
		try {
			if(gunsDTO.getGunsId()>0) {
				if(gunsDTO.getName()!=null) {
					if(gunsDTO.getPrice()>0) {
						if(gunsDTO.getSerialNumber()>0) {
							if(gunsDTO.getBrandName()!=null) {
								if(gunsDTO.getType()!=null) {
									if(gunsDTO.getNoOfBullets()>0) {
										if(gunsDTO.getMadeIn()!=null) {
											gunsDAO.add(gunsDTO);
											System.out.println("details added");
										}else {
											System.out.println("enter valid made in country");
										}
										
									}else {
										System.out.println("enter valid no of bullets");
									}
									
								}else {
									System.out.println("enter valid type");
								}
							}else {
								System.out.println("enter valid brand name ");
							}
							
						}else {
							System.out.println("enter valid serial no ");
						}
						
					}else {
						System.out.println("enter valid price ");
					}
					
				}else {
					System.out.println("enter valid name ");
				}
				
			}else {
				System.out.println("enter valid id ");
			}
			
		}catch(Exception e) {
			System.out.println("please enter valid input");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void validateAndGet() {
		// TODO Auto-generated method stub
		try {
			if(gunsDTO.getGunsId()>0) {
				if(gunsDTO.getName()!=null) {
					if(gunsDTO.getPrice()>0) {
						if(gunsDTO.getSerialNumber()>0) {
							if(gunsDTO.getBrandName()!=null) {
								if(gunsDTO.getType()!=null) {
									if(gunsDTO.getNoOfBullets()>0) {
										if(gunsDTO.getMadeIn()!=null) {
											gunsDAO.getAll();
											System.out.println("details added");
										}else {
											System.out.println("enter valid made in country");
										}
										
									}else {
										System.out.println("enter valid no of bullets");
									}
									
								}else {
									System.out.println("enter valid type");
								}
							}else {
								System.out.println("enter valid brand name ");
							}
							
						}else {
							System.out.println("enter valid serial no ");
						}
						
					}else {
						System.out.println("enter valid price ");
					}
					
				}else {
					System.out.println("enter valid name ");
				}
				
			}else {
				System.out.println("enter valid id ");
			}
			
		}catch(Exception e) {
			System.out.println("please enter valid input");
			e.printStackTrace();
		}	
	}

	@Override
	public void validateAndUpdate(int serialNumber, int price) {
		// TODO Auto-generated method stub
		try {
			if(gunsDTO.getGunsId()>0) {
				if(gunsDTO.getName()!=null) {
					if(gunsDTO.getPrice()>0) {
						if(gunsDTO.getSerialNumber()>0) {
							if(gunsDTO.getBrandName()!=null) {
								if(gunsDTO.getType()!=null) {
									if(gunsDTO.getNoOfBullets()>0) {
										if(gunsDTO.getMadeIn()!=null) {
											gunsDAO.updateBySerialNumber( serialNumber, price);
											System.out.println("details added");
										}else {
											System.out.println("enter valid made in country");
										}
										
									}else {
										System.out.println("enter valid no of bullets");
									}
									
								}else {
									System.out.println("enter valid type");
								}
							}else {
								System.out.println("enter valid brand name ");
							}
							
						}else {
							System.out.println("enter valid serial no ");
						}
						
					}else {
						System.out.println("enter valid price ");
					}
					
				}else {
					System.out.println("enter valid name ");
				}
				
			}else {
				System.out.println("enter valid id ");
			}
			
		}catch(Exception e) {
			System.out.println("please enter valid input");
			e.printStackTrace();
		}
	}

	@Override
	public void validateAndGetAllByBrandName(String brandName) {
		// TODO Auto-generated method stub
		try {
			if(gunsDTO.getGunsId()>0) {
				if(gunsDTO.getName()!=null) {
					if(gunsDTO.getPrice()>0) {
						if(gunsDTO.getSerialNumber()>0) {
							if(gunsDTO.getBrandName()!=null) {
								if(gunsDTO.getType()!=null) {
									if(gunsDTO.getNoOfBullets()>0) {
										if(gunsDTO.getMadeIn()!=null) {
											gunsDAO.getAllByBrandName(brandName);
											System.out.println("details added");
										}else {
											System.out.println("enter valid made in country");
										}
										
									}else {
										System.out.println("enter valid no of bullets");
									}
									
								}else {
									System.out.println("enter valid type");
								}
							}else {
								System.out.println("enter valid brand name ");
							}
							
						}else {
							System.out.println("enter valid serial no ");
						}
						
					}else {
						System.out.println("enter valid price ");
					}
					
				}else {
					System.out.println("enter valid name ");
				}
				
			}else {
				System.out.println("enter valid id ");
			}
			
		}catch(Exception e) {
			System.out.println("please enter valid input");
			e.printStackTrace();
		}
	}

	@Override
	public void validateAndgetAllByCountryName(String madeIn) {
		// TODO Auto-generated method stub
		try {
			if(gunsDTO.getGunsId()>0) {
				if(gunsDTO.getName()!=null) {
					if(gunsDTO.getPrice()>0) {
						if(gunsDTO.getSerialNumber()>0) {
							if(gunsDTO.getBrandName()!=null) {
								if(gunsDTO.getType()!=null) {
									if(gunsDTO.getNoOfBullets()>0) {
										if(gunsDTO.getMadeIn()!=null) {
											gunsDAO.getAllByCountryName(madeIn);
											System.out.println("details added");
										}else {
											System.out.println("enter valid made in country");
										}
										
									}else {
										System.out.println("enter valid no of bullets");
									}
									
								}else {
									System.out.println("enter valid type");
								}
							}else {
								System.out.println("enter valid brand name ");
							}
							
						}else {
							System.out.println("enter valid serial no ");
						}
						
					}else {
						System.out.println("enter valid price ");
					}
					
				}else {
					System.out.println("enter valid name ");
				}
				
			}else {
				System.out.println("enter valid id ");
			}
			
		}catch(Exception e) {
			System.out.println("please enter valid input");
			e.printStackTrace();
		}
	}


	@Override
	public void validateAnddeleteByGunsId(int gunsId) {
		// TODO Auto-generated method stub
		try {
			if(gunsDTO.getGunsId()>0) {
				if(gunsDTO.getName()!=null) {
					if(gunsDTO.getPrice()>0) {
						if(gunsDTO.getSerialNumber()>0) {
							if(gunsDTO.getBrandName()!=null) {
								if(gunsDTO.getType()!=null) {
									if(gunsDTO.getNoOfBullets()>0) {
										if(gunsDTO.getMadeIn()!=null) {
											gunsDAO.deleteByGunsId(gunsId);
											System.out.println("details added");
										}else {
											System.out.println("enter valid made in country");
										}
										
									}else {
										System.out.println("enter valid no of bullets");
									}
									
								}else {
									System.out.println("enter valid type");
								}
							}else {
								System.out.println("enter valid brand name ");
							}
							
						}else {
							System.out.println("enter valid serial no ");
						}
						
					}else {
						System.out.println("enter valid price ");
					}
					
				}else {
					System.out.println("enter valid name ");
				}
				
			}else {
				System.out.println("enter valid id ");
			}
			
		}catch(Exception e) {
			System.out.println("please enter valid input");
			e.printStackTrace();
		}
	}

		
	}

	


