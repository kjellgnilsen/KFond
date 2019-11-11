package net.familiennilsen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaClient
public class KFondStorageApplication {

	@Autowired
	static KFondConfig kFondConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(KFondStorageApplication.class, args);
		FetchExcelContent f = new FetchExcelContent();
		if (f != null) {
			System.out.println(f.getUrls());
		} else {
			System.out.println("null");
		}
		
		System.out.println(kFondConfig.getMessage());
		
	}

}
