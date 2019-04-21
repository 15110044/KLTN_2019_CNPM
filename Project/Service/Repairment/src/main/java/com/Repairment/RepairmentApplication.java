package com.Repairment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties
@Configuration
@EntityScan(basePackages = {"com.Repairment.Model"})  // scan JPA entities
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class RepairmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepairmentApplication.class, args);
	}

}
