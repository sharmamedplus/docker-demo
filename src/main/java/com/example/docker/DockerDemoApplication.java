package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/demo")
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Docker demo";
	}
}
