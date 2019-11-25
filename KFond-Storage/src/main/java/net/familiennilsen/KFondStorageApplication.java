package net.familiennilsen;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import net.familiennilsen.model.KFondUrlHash;
import net.familiennilsen.model.Message;

@SpringBootApplication
@EnableEurekaClient
public class KFondStorageApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KFondStorageApplication.class, args);
		String[] url = ctx.getBean(KFondConfig.class).getUrl();
		System.out.println(url.toString());
		final KFondUrlRepository rep = ctx.getBean(KFondUrlRepository.class);
		for (String string : url) {
			KFondUrlHash tmp = new KFondUrlHash();
			tmp.setUrl(string);
			rep.save(tmp);
		}
		
		System.out.println("antall lagret: " + rep.count());
		rep.findAll().forEach(a -> System.out.println(a.getUrl()));
		rep.findAll().forEach(new Consumer<KFondUrlHash>() {

			public void accept(KFondUrlHash t) {
				System.out.println(t.getUrl());
				
			}
			
		});

		Message m = ctx.getBean(KFondMessageConfig.class).getMessage();
		System.out.println(m.message);
		
		
		// Foreach url
		//  Download
		//  Check hash if exsists
		//  Parse csv
		//  foreach save author/title
		//  Save url and hash in db
	}

}
