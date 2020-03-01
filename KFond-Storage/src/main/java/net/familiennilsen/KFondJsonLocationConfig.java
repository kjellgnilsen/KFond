package net.familiennilsen;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import net.familiennilsen.model.JsonLocation;

@Configuration
@ConfigurationProperties(prefix="kfprops.json")
public class KFondJsonLocationConfig {
	private JsonLocation location;

	public JsonLocation getLocation() {
		return location;
	}

	public void setLocation(JsonLocation location) {
		this.location = location;
	}

	
}
