package net.familiennilsen.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KFondTildeling {
	@Id @GeneratedValue
	private String id;
	private String forfatter;
	private String tittel;
	private String forlag;
	private String vedtak;
	private LocalDate vedtaksdato;
	private String ordning;
	
	public String getForfatter() {
		return forfatter;
	}
	public void setForfatter(String forfatter) {
		this.forfatter = forfatter;
	}
	public String getTittel() {
		return tittel;
	}
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	public String getForlag() {
		return forlag;
	}
	public void setForlag(String forlag) {
		this.forlag = forlag;
	}
	public String getVedtak() {
		return vedtak;
	}
	public void setVedtak(String vedtak) {
		this.vedtak = vedtak;
	}
	public LocalDate getVedtaksdato() {
		return vedtaksdato;
	}
	public void setVedtaksdato(LocalDate vedtaksdato) {
		this.vedtaksdato = vedtaksdato;
	}
	public String getOrdning() {
		return ordning;
	}
	public void setOrdning(String ordning) {
		this.ordning = ordning;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
