package com.example.demo.UIApp;

import com.example.demo.SeatConfigService.SeatConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.example.demo.greetingService.Greeting;

@Controller
public class UIcontroller {




	 @GetMapping("/seat")
	    public String greetingForm(Model model) {
	        model.addAttribute("seat", new Seat());
	        return "uipage";
	    }
	 
	 
	 @PostMapping("/seat")
	    public String greetingSubmit(@ModelAttribute Seat seat) {
	    	
	    	final String uri = "https://railarunapi.herokuapp.com/seatconfig/"+seat.getSeatNo();
		 /*"http://kumararunesh211994-eval-prod.apigee.net/railseats/"+seat.getSeatNo() ;
		 * http://localhost:8090*/

		    RestTemplate restTemplate = new RestTemplate();
		    Seat seat1 = restTemplate.getForObject(uri, Seat.class);
            
		    seat.setBerth(seat1.getBerth());
		    seat.setSeatNo(seat1.getSeatNo());
		    seat.setOppBerth(seat1.getOppBerth());
		    
		    
	    	System.out.println(seat.getBerth());
	    	System.out.println(seat.getSeatNo());
	    	System.out.println(seat.getOppBerth());
	        return "res";
	    }

	
	
}
