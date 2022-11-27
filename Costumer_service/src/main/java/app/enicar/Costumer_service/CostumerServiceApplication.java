package app.enicar.Costumer_service;

import app.enicar.Costumer_service.dao.Customer;
import app.enicar.Costumer_service.dao.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CostumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepo customerRepository) {
		return args -> {
			customerRepository.save(new Customer(null, "Enset", "contact@enset-media.ma"));
			customerRepository.save(new Customer(null, "FSTM", "contact@fstm.ma"));
			customerRepository.save(new Customer(null, "ENSAM", "contact@ensam.ma"));
			customerRepository.findAll().forEach(System.out::println);
		};

	}
}
