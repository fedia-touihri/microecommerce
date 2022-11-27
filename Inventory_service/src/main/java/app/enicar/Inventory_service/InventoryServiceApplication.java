package app.enicar.Inventory_service;

import app.enicar.Inventory_service.dao.Product;
import app.enicar.Inventory_service.dao.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepo productRepository){
		return args->{
			productRepository.save(new Product(null , "Computer Desk Top HP",900));
			productRepository.save(new Product(null , "Printer Epson",90));
			productRepository.save(new Product(null , "Macbook Lap Top",1800));
			productRepository.findAll().forEach(System.out::println);
		};
	}
}
