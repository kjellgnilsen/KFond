package net.familiennilsen;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "kfprops")
public class KFondConfig {

	private  List<String> url = new ArrayList<String>();

	public KFondConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KFondConfig(List<String> url) {
		super();
		this.url = url;
	}

	public List<String> getUrl() {
		return url;
	}

	public void setUrl(List<String> url) {
		this.url = url;
	}

	
	

	
}
