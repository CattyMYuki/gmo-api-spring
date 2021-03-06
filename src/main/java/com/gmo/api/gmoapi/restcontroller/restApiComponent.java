package com.gmo.api.gmoapi.restcontroller;
import com.gmo.api.gmoapi.restcontroller.externalApi.gmoGetApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ch.qos.logback.core.rolling.helper.MonoTypedConverter;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class restApiComponent {	
	@Autowired
	gmoGetApi gmoGetApi;

	@GetMapping("/hello")
	 public String hello(){
		 return "hello";
	 } 
	@GetMapping("/ticker")
	 public String ticker(@RequestParam("alt_coin") String alt_coin) throws Exception {
		//gmoGetApi gmoGetApi = new gmoGetApi();
		return gmoGetApi.getTicker(alt_coin);
	 }
	}