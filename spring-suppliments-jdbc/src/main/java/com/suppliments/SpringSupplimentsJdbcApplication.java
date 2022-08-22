package com.suppliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suppliments.model.Suppliments;
import com.suppliments.service.ISupplimentsService;

@SpringBootApplication
public class SpringSupplimentsJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSupplimentsJdbcApplication.class, args);
	}
	@Autowired
	ISupplimentsService supplimentsService;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Suppliments suppliments=new Suppliments("Elite",7,6500,"Mass-Gainer-pro");
		 * supplimentsService.addSuppliments(suppliments);
		 */
		
		supplimentsService.updateSuppliments(4, 5500.0);
		
		supplimentsService.deleteSuppliments(6);
	}

}
