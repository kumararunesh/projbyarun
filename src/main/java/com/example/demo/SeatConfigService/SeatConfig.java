package com.example.demo.SeatConfigService;

public class SeatConfig {

	String SeatNo ;
	String Berth;
	String OppBerth;
	

	public SeatConfig() {
		
	
	}
	
	public SeatConfig(String berth, String oppBerth, String seatNo) {
		super();
		Berth = berth;
		OppBerth = oppBerth;
		SeatNo = seatNo;
	}
	
	
	public String getBerth() {
		return Berth;
	}
	public void setBerth(String berth) {
		Berth = berth;
	}
	public String getOppBerth() {
		return OppBerth;
	}
	public void setOppBerth(String oppBerth) {
		OppBerth = oppBerth;
	}

	public String getSeatNo() {
		return SeatNo;
	}

	public void setSeatNo(String seatNo) {
		SeatNo = seatNo;
	}

	
	
	

}
