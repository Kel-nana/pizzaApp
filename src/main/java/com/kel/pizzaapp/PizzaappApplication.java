package com.kel.pizzaapp;

import com.kel.pizzaapp.config.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class PizzaappApplication implements CommandLineRunner {

	private PizzaConfig pizzaConfig;


	public PizzaappApplication(PizzaConfig pizzaConfig ) {
		this.pizzaConfig = pizzaConfig;
	}
	public static void main(String[] args) {

		SpringApplication.run(PizzaappApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info (
				String.format("I want a %s crust pizza, with%s and %s sauce",
						pizzaConfig.getCrust(),
						pizzaConfig.getTopping(),
						pizzaConfig.getSauce()
				));

	}


	}


