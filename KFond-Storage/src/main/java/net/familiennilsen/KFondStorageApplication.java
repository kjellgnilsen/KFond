package net.familiennilsen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KFondStorageApplication {



	public KFondStorageApplication(KFondConfig kFondConfig) {
		this.kFondConfig = kFondConfig;
	}

	public final KFondConfig kFondConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(KFondStorageApplication.class, args);
		
	}

}
