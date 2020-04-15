package com.example.demo.SeatConfigCall;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SeatConfigCall {

	
	@RequestMapping("/seatconfigcall/{id}")
	private static String getEmployees(@PathVariable String id)
	{
	    final String uri = "http://kumararunesh211994-eval-prod.apigee.net/railarun/"+id ;

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    return result ;
	}
}
