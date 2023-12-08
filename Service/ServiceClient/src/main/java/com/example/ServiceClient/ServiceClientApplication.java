package com.example.ServiceClient;

import com.example.ServiceClient.Model.Client;
import com.example.ServiceClient.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient

@SpringBootApplication
public class ServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository repo){
		return args -> {
				repo.save(new Client(Long.parseLong("1"),Float.parseFloat("36"),"Chafik","Baidada"));
				repo.save(new Client(Long.parseLong("2"),Float.parseFloat("29"),"Mouhamed ","Lachuer"));
				repo.save(new Client(Long.parseLong("3"),Float.parseFloat("50"),"Fahd","Kalloubi"));
		};
	}


}
