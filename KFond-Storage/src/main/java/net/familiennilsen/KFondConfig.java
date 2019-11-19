package net.familiennilsen;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class KFondConfig {

	@Autowired
	Environment environment;

	private  Map<String, String> config = new HashMap<String, String>();

	public Map<String, String> getConfig() {
		return config;
	}

	public void setConfig(Map<String, String> config) {
		this.config = config;
	}

	public String getMessage() {
		return environment.getProperty("message");
	}
}
