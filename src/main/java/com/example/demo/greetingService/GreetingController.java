package com.example.demo.greetingService;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
    	
    	final String uri = "https://railarunapi.herokuapp.com/seatconfig/"+greeting.getContent() ;

	    RestTemplate restTemplate = new RestTemplate();
	    String result1 = restTemplate.getForObject(uri, String.class);

    	
    	greeting.setContent(result1);  
    	System.out.println(greeting.getContent());
        return "result";
    }

}