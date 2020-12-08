package com.cristobal.alkemy.models.DTO;


public class UserLoginDTO {
	
	// @NotBlank
	 private String rut;
	 
	 //@NotBlank
	 private String password;

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
	 

}
