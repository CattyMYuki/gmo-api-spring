package com.gmo.api.gmoapi.restcontroller;
import com.gmo.api.gmoapi.restcontroller.externalApi.gmoGetApi;
//import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class restApiComponent {	
	@GetMapping("/hello")
	 public String hello(){
		 return "hello";
	 } 
	@GetMapping("/ticker")
	 public String ticker(@RequestParam("alt_coin") String alt_coin) throws Exception {
		gmoGetApi gmoGetApi = new gmoGetApi();
		return gmoGetApi.getTicker(alt_coin);
	 }
	}