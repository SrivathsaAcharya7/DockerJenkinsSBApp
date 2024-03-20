package com.DockerJenkinsSBApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsSbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsSbAppApplication.class, args);
		System.out.println("App Started");
	}

}
