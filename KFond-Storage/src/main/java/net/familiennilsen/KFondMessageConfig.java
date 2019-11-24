package net.familiennilsen;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import net.familiennilsen.model.Message;

@Configuration
@ConfigurationProperties(prefix="kfprops.p")
public class KFondMessageConfig {
	private Message message;

	public Message getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	public void setMessage(Message message) {
		this.message=message;
	}
}
