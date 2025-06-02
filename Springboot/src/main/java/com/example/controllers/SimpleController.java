package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Student;
import com.example.sub1.SpringComponent;




@Controller
public class SimpleController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${google.maps.api.key}")
    private String googleMapsApiKey;
	
	@Autowired
	private SpringComponent springComponent;
   
	
	@GetMapping("/home")
	public String gethome() {
		return "home";
	}
	
	@GetMapping(path = "/getStudent")
	@ResponseBody
	public Student getStudent() {
		return new Student("John","Mathew");
	}
	
	@GetMapping(path = "/getMessage")
	@ResponseBody
	public String getMessage() {
		String msg = springComponent.getMessage();
		return msg;
	}
	
	@GetMapping("/map")
    public String getMap(Model model) {
        //model.addAttribute("googleMapsApiKey", googleMapsApiKey);
        return "map";
    }
	
	
	
}
