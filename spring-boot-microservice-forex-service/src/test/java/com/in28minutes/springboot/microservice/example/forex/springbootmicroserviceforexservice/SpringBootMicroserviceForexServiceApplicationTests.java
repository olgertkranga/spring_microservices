package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMicroserviceForexServiceApplicationTests {

	//First Unit test - This is real not null application
	@Test
	void contextLoads() {
		SpringBootMicroserviceForexServiceApplication springBootMicroserviceForexServiceApplication = new SpringBootMicroserviceForexServiceApplication();	
		assertNotNull(springBootMicroserviceForexServiceApplication);
	}

}
