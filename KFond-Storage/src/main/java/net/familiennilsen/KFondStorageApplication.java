package net.familiennilsen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KFondStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(KFondStorageApplication.class, args);
	}

}
