package ru.tinkoff.fintech.qa.api_models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest{

	@JsonProperty("passportNumber")
	private int passportNumber;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("id")
	private int id;

	@JsonProperty("fio")
	private String fio;

	@JsonProperty("passportSeries")
	private int passportSeries;

	public void setPassportNumber(int passportNumber){
		this.passportNumber = passportNumber;
	}

	public int getPassportNumber(){
		return passportNumber;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFio(String fio){
		this.fio = fio;
	}

	public String getFio(){
		return fio;
	}

	public void setPassportSeries(int passportSeries){
		this.passportSeries = passportSeries;
	}

	public int getPassportSeries(){
		return passportSeries;
	}
}