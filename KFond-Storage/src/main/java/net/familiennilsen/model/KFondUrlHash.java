package net.familiennilsen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KFondUrlHash {

	@Id @GeneratedValue
	private Integer id;
	@Column(length=1000)
	private String url;
	private int md5;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	public KFondUrlHash(String url) {
		super();
		this.url = url;
		this.md5 = 0;
	}

	public KFondUrlHash() {
		super();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getMd5() {
		return md5;
	}

	public void setMd5(int md5) {
		this.md5 = md5;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
