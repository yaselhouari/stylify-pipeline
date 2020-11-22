package com.example.ec;

import com.example.ec.domain.MyServicePackage;
import com.example.ec.service.MyServicePackageService;
import com.example.ec.service.MyServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StylifyApplication implements CommandLineRunner {

    @Autowired
    private MyServicePackageService servicePackage;
    @Autowired
    private MyServiceProviderService providerService;


    public static void main(String[] args) {
		SpringApplication.run(StylifyApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {



    }
    
}
