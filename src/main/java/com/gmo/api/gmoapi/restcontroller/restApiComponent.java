package com.gmo.api.gmoapi.restcontroller;
//import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restApiComponent {	
	@GetMapping("/hello")
	 public String hello(){
		 return "hello";
	 } 
}