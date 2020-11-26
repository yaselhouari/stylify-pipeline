package com.example.ec;

import com.example.ec.domain.MyService;
import com.example.ec.domain.MyServicePackage;
import com.example.ec.service.MyServicePackageService;
import com.example.ec.service.MyServiceProviderService;
import com.example.ec.service.MyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StylifyApplication implements CommandLineRunner {

    @Autowired
    private MyServiceService service;
    private MyServiceProviderService servicePackage;



    public static void main(String[] args) {
		SpringApplication.run(StylifyApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        MyService myService = new MyService("title",  "description",  "price",  "duration");
        MyServicePackage myPackage = new MyServicePackage(10,  "soins de visage", "description", "f", "/icons/10.png");
        myService.setMyServicePackage(myPackage);
        service.create(myService);
    }
    
}
