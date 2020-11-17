package com.example.ec;

import com.example.ec.service.AServicePackageService;
import com.example.ec.service.AServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Class for the Spring Boot Application
 *
 * Created by Yassine El Houari
 */
@SpringBootApplication
public class ExplorecaliApplication  implements CommandLineRunner {
	@Autowired
	AServiceService serviceService;

	@Autowired
	AServicePackageService servicePackageService;

	public static void main(String[] args) {
		SpringApplication.run(ExplorecaliApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(servicePackageService.total());
		System.out.println(serviceService.total());
	}
}
