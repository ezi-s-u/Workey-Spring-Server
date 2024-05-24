package com.example.workey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
//@ComponentScan(basePackages = "com.example.workey.domain")
public class WorkeySpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkeySpringServerApplication.class, args);
	}

}
