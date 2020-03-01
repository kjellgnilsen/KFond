package net.familiennilsen;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "kfprops")
public class KFondConfig {

	private  String[] url = null;

	public KFondConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KFondConfig(String[] url) {
		super();
		this.url = url;
	}

	public String[] getUrl() {
		return url;
	}

	public void setUrl(String[] url) {
		this.url = url;
	}

	
	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(new ObjectMapper	());
		restTemplate.getMessageConverters().add(converter);
		return restTemplate;
	}


	
}
