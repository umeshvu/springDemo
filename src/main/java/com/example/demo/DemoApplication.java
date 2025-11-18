package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		@GetMapping("/")
  		public String hello(){ return "Hello world!"; }
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
