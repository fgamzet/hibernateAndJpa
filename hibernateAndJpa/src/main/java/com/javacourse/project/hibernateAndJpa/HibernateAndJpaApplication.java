package com.javacourse.project.hibernateAndJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.javacourse.project.hibernateAndJpa.Entities")
public class HibernateAndJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateAndJpaApplication.class, args);
	}

}
