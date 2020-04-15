package com.example.demo.UIApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Seat {
	
	String seatNo ;
	String berth;
	String oppBerth;
	
	public Seat() {
		
	}
	
	public Seat(String seatNo, String berth, String oppBerth) {
		super();
		this.seatNo = seatNo;
		this.berth = berth;
		this.oppBerth = oppBerth;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getBerth() {
		return berth;
	}
	public void setBerth(String berth) {
		this.berth = berth;
	}
	public String getOppBerth() {
		return oppBerth;
	}
	public void setOppBerth(String oppBerth) {
		this.oppBerth = oppBerth;
	}
	
	
	

}
