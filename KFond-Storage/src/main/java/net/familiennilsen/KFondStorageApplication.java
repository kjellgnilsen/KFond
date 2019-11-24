package net.familiennilsen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class KFondStorageApplication {



	public KFondStorageApplication(KFondConfig kFondConfig) {
		this.kFondConfig = kFondConfig;
	}

	public final KFondConfig kFondConfig;
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KFondStorageApplication.class, args);
		System.out.println(ctx.getBean(KFondConfig.class).getConfig());
			System.out.println("");
		
		System.out.println(ctx.getBean(KFondMessageConfig.class).getMessage());
	}

}
