package net.familiennilsen;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import net.familiennilsen.model.JsonLocation;
@Data
@Configuration
@ConfigurationProperties(prefix="kfprops.json")
public class KFondJsonLocationConfig {
	private JsonLocation location;

	
}
