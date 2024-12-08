package com.jpaPractice.db_demo;

import com.jpaPractice.db_demo.entity.StoreInformation;
import com.jpaPractice.db_demo.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication implements  CommandLineRunner{

	@Autowired
	StoreInformationRepository storeInformationRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		StoreInformation storeInformationOne = new StoreInformation("Amazon",
				"all types of bags are available", "9876543322");
		StoreInformation storeInformationTwo = new StoreInformation(
				"Flipkart",
				"Offers a variety of electronics and accessories",
				"9876543210"
		);

		StoreInformation storeInformationThree = new StoreInformation(
				"Myntra",
				"Wide range of fashionable apparel",
				"9876543333"
		);

		StoreInformation storeInformationFour = new StoreInformation(
				"Decathlon",
				"Sports equipment and gear available",
				"9876543344"
		);


		storeInformationRepository.save(storeInformationOne);
		storeInformationRepository.save(storeInformationTwo);
		storeInformationRepository.save(storeInformationThree);
		storeInformationRepository.save(storeInformationFour);

		storeInformationRepository.findByStoreName("Decathlon").forEach(
				val-> System.out.println(val)
		);

		storeInformationRepository.findByStoreName("Decathlon").forEach(
				val-> System.out.println(val)
		);
	}
}
