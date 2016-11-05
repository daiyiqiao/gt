package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tfunctn entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tfunctn", schema = "public")

public class Tfunctn implements java.io.Serializable {

	// Fields

	private String functncd;
	private String functnnm;
	private String functnurl;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;
	private String serflg;

	// Constructors

	/** default constructor */
	public Tfunctn() {
	}

	/** full constructor */
	public Tfunctn(String functnnm, String functnurl, Integer crtusrid, Timestamp crttime, Integer updtusrid,
			Timestamp updttime, String serflg) {
		this.functnnm = functnnm;
		this.functnurl = functnurl;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
		this.serflg = serflg;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "functncd", unique = true, nullable = false, length = 4)

	public String getFunctncd() {
		return this.functncd;
	}

	public void setFunctncd(String functncd) {
		this.functncd = functncd;
	}

	@Column(name = "functnnm", length = 16)

	public String getFunctnnm() {
		return this.functnnm;
	}

	public void setFunctnnm(String functnnm) {
		this.functnnm = functnnm;
	}

	@Column(name = "functnurl", length = 64)

	public String getFunctnurl() {
		return this.functnurl;
	}

	public void setFunctnurl(String functnurl) {
		this.functnurl = functnurl;
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

	@Column(name = "serflg", length = 1)

	public String getSerflg() {
		return this.serflg;
	}

	public void setSerflg(String serflg) {
		this.serflg = serflg;
	}

}