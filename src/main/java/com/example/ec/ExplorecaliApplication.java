package com.example.ec;

import com.example.ec.service.MyServicePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExplorecaliApplication implements CommandLineRunner {

    @Autowired
    private MyServicePackageService servicePackage;


    public static void main(String[] args) {
		SpringApplication.run(ExplorecaliApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println(servicePackage.total());
        servicePackage.createServicePackage(11,"name", "description");
        System.out.println(servicePackage.total());
    }
    
}
