package com.example.demo.SeatConfigService;

import org.springframework.stereotype.Service;

@Service

public class SeatConfigService {
	
	private SeatConfig SeatConfig = new SeatConfig();
	
	
	public SeatConfig getseat(String id)
	{    
		int a = Integer.parseInt(id);
		int b = a % 12;
		int m = a/12;
		String c = "No";
		int opp =0;
		
		
		
		switch(b)
		{
		case 0 : c = "Window Seat" ; opp = b-11 ; break ;
		case 1 : c = "Window Seat"; opp = b+11 ; break ;
		case 2 :c = "Middle Seat"; opp = b+9 ; break ;
		case 3 : c= "Asile Seat "; opp = b+7 ; break ;
		case 4 : c=  "Asile Seat "; opp = b+5 ; break ;
		case 5 :c ="Middle Seat"; opp = b+3 ; break ;
		case 6 : c = "Window Seat" ; opp = b+1 ; break ;
		case 7 : c = "Window Seat"; opp = b-1 ; break ;
		case 8 :c = "Middle Seat"; opp = b-3 ; break ;
		case 9 : c= "Asile Seat "; opp = b-5 ; break ;
		case 10 : c=  "Asile Seat "; opp = b-7 ; break ;
		case 11 :c ="Middle Seat"; opp = b-9 ; break ;
		}
		
		
		opp = opp + 12*m;
		
		
		SeatConfig.setSeatNo(id);
		SeatConfig.setBerth(c);
		SeatConfig.setOppBerth(Integer.toString(opp));
		
		return SeatConfig;
		

	}
	
}
