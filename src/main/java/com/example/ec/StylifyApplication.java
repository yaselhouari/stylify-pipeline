package com.example.ec;

import com.example.ec.domain.MyClient;
import com.example.ec.domain.MyService;
import com.example.ec.domain.MyServicePackage;
import com.example.ec.domain.MyServiceProvider;
import com.example.ec.entities.Role;
import com.example.ec.entities.User;
import com.example.ec.repo.MyClientRepository;
import com.example.ec.repo.MyServicePackageRepository;
import com.example.ec.repo.MyServiceProviderRepository;
import com.example.ec.repo.MyServiceRepository;
import com.example.ec.service.MyServicePackageService;
import com.example.ec.service.MyServiceProviderService;
import com.example.ec.service.MyServiceService;
import com.example.ec.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StylifyApplication implements CommandLineRunner {

    @Autowired
    private MyClientRepository clientRepository;
    @Autowired
    private MyServiceRepository serviceRepository;
    @Autowired
    private MyServicePackageRepository packageRepository;

    @Autowired
    private MyServiceProviderRepository providerRepository;

    public static void main(String[] args) {

        SpringApplication.run(StylifyApplication.class, args);
	}


    @Bean
    public CommandLineRunner setupDefaultUser(UserService service) {
        return args -> {
            service.save(new User(
                    "user", //username
                    "user", //password
                    Arrays.asList(new Role("USER"), new Role("ACTUATOR")),//roles
                    true//Active
            ));
        };
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }


    @Override
    public void run(String... args) throws Exception {

        //Add Service Providers
            //Login
            //Subscribe
            //Provide documents
            //Set working hours
            //Mobile Verification
        //Add Clients
            //Login
            //Subscribe
            //Mobile verification
        //Add services to service providers
            //Create catalog
            //Set prices for services
        //Clients search for services
            //Keywords
            //Location
            //Time needs work
            //Price
        //Communication between clients and providers
            //Confirmation
        //Client rating services
        //Clients rating apps
        
        //Appointments();
        //AddServicesToProviders();
        //AddRatingToServiceProvider()


    }

    private void AddServicesToProviders() {
        MyServiceProvider myServiceProvider = new MyServiceProvider();

        MyService service11 = new MyService();
        service11.setMyServiceProvider(myServiceProvider);
        MyService service22 = new MyService();
        service22.setMyServiceProvider(myServiceProvider);
        MyService service33 = new MyService();
        service33.setMyServiceProvider(myServiceProvider);

        List<MyService> services = new ArrayList<>();
        services.add(service11);
        services.add(service22);
        services.add(service33);


        myServiceProvider.setMyServices(services);
        providerRepository.save(myServiceProvider);
    }

    private void Appointments() {
        MyClient client1 = new MyClient();
        MyClient client2 = new MyClient();
        MyClient client3 = new MyClient();

        List<MyClient> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clientRepository.saveAll(clients);

        MyService service1 = new MyService();
        MyService service2 = new MyService();
        MyService service3 = new MyService();

        List<MyService> services = new ArrayList<>();
        services.add(service1);
        services.add(service2);
        services.add(service3);
        serviceRepository.saveAll(services);

        service1.addClient(client1);
        service2.addClient(client2);
        service3.addClient(client3);
        serviceRepository.saveAll(services);
    }

}
