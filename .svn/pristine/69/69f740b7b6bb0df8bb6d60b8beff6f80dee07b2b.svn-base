package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tfileformat entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tfileformat", schema = "public")

public class Tfileformat implements java.io.Serializable {

	// Fields

	private String fcd;
	private String fnm;
	private String delflg;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tfileformat() {
	}

	/** full constructor */
	public Tfileformat(String fnm, String delflg, Integer crtusrid, Timestamp crttime, Integer updtusrid,
			Timestamp updttime) {
		this.fnm = fnm;
		this.delflg = delflg;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "fcd", unique = true, nullable = false, length = 3)

	public String getFcd() {
		return this.fcd;
	}

	public void setFcd(String fcd) {
		this.fcd = fcd;
	}

	@Column(name = "fnm", length = 8)

	public String getFnm() {
		return this.fnm;
	}

	public void setFnm(String fnm) {
		this.fnm = fnm;
	}

	@Column(name = "delflg", length = 1)

	public String getDelflg() {
		return this.delflg;
	}

	public void setDelflg(String delflg) {
		this.delflg = delflg;
	}

	@Column(name = "crtusrid")

	public Integer getCrtusrid() {
		return this.crtusrid;
	}

	public void setCrtusrid(Integer crtusrid) {
		this.crtusrid = crtusrid;
	}

	@Column(name = "crttime", length = 29)

	public Timestamp getCrttime() {
		return this.crttime;
	}

	public void setCrttime(Timestamp crttime) {
		this.crttime = crttime;
	}

	@Column(name = "updtusrid")

	public Integer getUpdtusrid() {
		return this.updtusrid;
	}

	public void setUpdtusrid(Integer updtusrid) {
		this.updtusrid = updtusrid;
	}

	@Column(name = "updttime", length = 29)

	public Timestamp getUpdttime() {
		return this.updttime;
	}

	public void setUpdttime(Timestamp updttime) {
		this.updttime = updttime;
	}

}