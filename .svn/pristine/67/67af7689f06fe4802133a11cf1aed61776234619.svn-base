package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tsyntime entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tsyntime", schema = "public")

public class Tsyntime implements java.io.Serializable {

	// Fields

	private String syntype;
	private Timestamp syntime;
	private String syndesc;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tsyntime() {
	}

	/** full constructor */
	public Tsyntime(Timestamp syntime, String syndesc, Integer crtusrid, Timestamp crttime, Integer updtusrid,
			Timestamp updttime) {
		this.syntime = syntime;
		this.syndesc = syndesc;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "syntype", unique = true, nullable = false, length = 8)

	public String getSyntype() {
		return this.syntype;
	}

	public void setSyntype(String syntype) {
		this.syntype = syntype;
	}

	@Column(name = "syntime", length = 29)

	public Timestamp getSyntime() {
		return this.syntime;
	}

	public void setSyntime(Timestamp syntime) {
		this.syntime = syntime;
	}

	@Column(name = "syndesc", length = 32)

	public String getSyndesc() {
		return this.syndesc;
	}

	public void setSyndesc(String syndesc) {
		this.syndesc = syndesc;
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