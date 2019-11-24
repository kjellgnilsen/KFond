package net.familiennilsen.model;

public class KFondUrl {
	private String url;
	private String ordning;
	private int year;
	private String comment;
	
	public KFondUrl() {
		super();
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getOrdning() {
		return ordning;
	}
	public void setOrdning(String ordning) {
		this.ordning = ordning;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public KFondUrl(String url, String ordning, int year) {
		super();
		this.url = url;
		this.ordning = ordning;
		this.year = year;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
