package net.familiennilsen.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Data
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
	

}
