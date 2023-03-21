package com.techgeeknext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan
public class SpringBootUploadImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadImageApplication.class, args);
	}
}