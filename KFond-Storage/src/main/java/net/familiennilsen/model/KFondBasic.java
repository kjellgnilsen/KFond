package net.familiennilsen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KFondBasic {

	
	@Id @GeneratedValue private Integer id;
	private String author;
	private String title;
	
	public KFondBasic(Integer id, String author, String title) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
	}

	public KFondBasic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
}
