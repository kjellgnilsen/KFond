package net.familiennilsen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KFondBasic {

	public KFondBasic(String author, String title) {
		this.author=author;
		this.title=title;
		
	}
	@Id @GeneratedValue private String id;
	private String author;
	private String title;
	public String getAuthor() {
		
		return author;
	}
	public String getTitle() {
		return title;
	}
	public String getId() {
		return id;
	}
	
}
