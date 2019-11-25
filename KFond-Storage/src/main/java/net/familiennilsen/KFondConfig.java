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

	
	

	
}
