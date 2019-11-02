package net.familiennilsen.model;

import java.net.URL;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KFondUrl {
	
	public KFondUrl(URL url, String ordning, int year) {
		this.url = url;
		this.ordning = ordning;
		this.year = year;

	}
	private URL url;
	private String ordning;
	private int year;
	public URL getURL() {
		
		return url;
	}
	public String getOrdning() {
		return this.ordning;
	}
	public int getYear() {
		
		return this.year;
	}
}
