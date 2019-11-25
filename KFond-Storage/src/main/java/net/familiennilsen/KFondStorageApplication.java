package net.familiennilsen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import net.familiennilsen.model.Message;

@SpringBootApplication
@EnableEurekaClient
public class KFondStorageApplication {

	public KFondStorageApplication(KFondConfig kFondConfig) {
		this.kFondConfig = kFondConfig;
	}

	public final KFondConfig kFondConfig;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KFondStorageApplication.class, args);
		System.out.println(ctx.getBean(KFondConfig.class).getUrl());
		System.out.println("");

		Message m = ctx.getBean(KFondMessageConfig.class).getMessage();
		System.out.println(m.message);
	}

}
