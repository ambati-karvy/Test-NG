package com.karvy.courier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class CourierDataConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourierDataConnectApplication.class, args);
	}

}

