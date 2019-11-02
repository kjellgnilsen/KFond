package net.familiennilsen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class KFondBasic {

	public KFondBasic(String author, String title) {
		this.author=author;
		this.title=title;
		
	}
	@Id @GeneratedValue private String id;
	@NonNull private String author;
	@NonNull private String title;
	
}
