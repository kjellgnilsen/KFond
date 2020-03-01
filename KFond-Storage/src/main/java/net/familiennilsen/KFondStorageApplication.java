package net.familiennilsen;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.familiennilsen.model.KFondTildelinger;

@SpringBootApplication
@EnableEurekaClient
public class KFondStorageApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KFondStorageApplication.class, args);
		final KFondTildelingRepository rep = ctx.getBean(KFondTildelingRepository.class);
		final KFondJsonLocationConfig config = ctx.getBean(KFondJsonLocationConfig.class);
		
		
		
		InputStream stream=null;
		System.out.println(config.getLocation().getLocation().toString());
		try {
			stream = new URL(config.getLocation().toString()).openStream();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		KFondTildelinger tildelinger = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			tildelinger = mapper.readValue(stream, KFondTildelinger.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		System.out.println("antall lagret: " + rep.count());
//		rep.findAll().forEach(a -> System.out.println(a.getUrl()));
//		Message m = ctx.getBean(KFondMessageConfig.class).getMessage();
//		System.out.println(m.message);

		
		
		
		
		// Foreach url
		// Download
		// Check hash if exsists
		// Parse csv
		// foreach save author/title
		// Save url and hash in db
	}

	

}
