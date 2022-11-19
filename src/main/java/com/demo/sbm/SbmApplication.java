package com.demo.sbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbmApplication {

	public static void main(String[] args) {

		SpringApplication.run(SbmApplication.class, args);
	}



}
