package com.example.ec;

import com.example.ec.entities.MyClient;
import com.example.ec.entities.MyService;
import com.example.ec.entities.MyServiceProvider;
import com.example.ec.entities.Role;
import com.example.ec.entities.User;
import com.example.ec.repo.*;
import com.example.ec.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
    private MyDisplayServicePackageRepository packageRepository;
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
        //CrudClient();
        //CrudProvider();
        //Appointments();
        //AddServicesToProvider();
        //Create the Schedule
            //Set working hours
            //Fixed Days
            //On demande
            //Both

            //Get display services
            //Create services based on display services
            //Attach them to providers
            //Display them in the catalog


        //Set Display Package and services for research

        //Clients search for services  (not yet)
        //Keywords (not yet)
        //Location (not yet)
        //Time needs work (not yet)
        //Price (not yet)
        //Communication between clients and providers (not yet)
        //Client rating services  (not yet)
        //Clients rating apps  (not yet)
        //Provide documents (not yet)
        //Login (not yet)
        //Subscribe (not yet)
        //Mobile Verification (not yet)





    }

    private void CrudClient() {
        MyClient client = new MyClient();
        clientRepository.save(client);
        client.setFirstName("yassine");
        clientRepository.save(client);
        MyClient anotherclient =new MyClient();
        clientRepository.save(anotherclient);
        clientRepository.delete(anotherclient);
    }

    private void AddServicesToProvider() {
        MyService service1 = new MyService();
        MyService service2 = new MyService();
        MyService service3 = new MyService();

        MyServiceProvider provider = new MyServiceProvider();
        List<MyService> services =    Arrays.asList(service1, service2, service3);

        service1.setMyServiceProvider(provider);
        service2.setMyServiceProvider(provider);
        service3.setMyServiceProvider(provider);

        provider.setMyServices(services);
        providerRepository.save(provider);
    }

    private void CrudProvider() {
        MyServiceProvider provider = new MyServiceProvider();
        providerRepository.save(provider);

        provider.setFirstName("Yassine");
        providerRepository.save(provider);

        MyServiceProvider anotherProvider = new MyServiceProvider();
        providerRepository.save(anotherProvider);
        providerRepository.delete(anotherProvider);
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
        //Getting the client
        MyClient client1 = new MyClient();
        MyClient client2 = new MyClient();
        MyClient client3 = new MyClient();

        List<MyClient> clients = new ArrayList<>();
        clients = Arrays.asList(client1, client2, client3);
        clientRepository.saveAll(clients);

        //Getting the servies
        MyService service1 = new MyService();
        MyService service2 = new MyService();
        MyService service3 = new MyService();

        //Getting the provider
        MyServiceProvider provider = new MyServiceProvider();
        providerRepository.save(provider);

        List<MyService> services = new ArrayList<>();
        services = Arrays.asList(service1, service2, service3);

        service1.setMyServiceProvider(provider);
        service2.setMyServiceProvider(provider);
        service3.setMyServiceProvider(provider);

        provider.setMyServices(services);

        serviceRepository.saveAll(services);

        service1.addClient(client1);
        service2.addClient(client2);
        service3.addClient(client3);
        serviceRepository.saveAll(services);
    }

}
