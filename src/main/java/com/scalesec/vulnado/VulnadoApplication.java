package com.scalesec.vulnado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//fortesting
@ServletComponentScan
@SpringBootApplication
public class VulnadoApplication {
	public static void main(String[] args) {
		System.out.println("test");
		Postgres.setup();
		SpringApplication.run(VulnadoApplication.class, args);
	}
}
