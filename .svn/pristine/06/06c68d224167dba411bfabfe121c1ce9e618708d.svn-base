package com.gt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Texportmatedata entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "texportmatedata", schema = "public")

public class Texportmatedata implements java.io.Serializable {

	// Fields

	private Integer expcd;
	private String expstarttime;
	private String sercd;
	private String exptype;

	// Constructors

	/** default constructor */
	public Texportmatedata() {
	}

	/** full constructor */
	public Texportmatedata(String expstarttime, String sercd, String exptype) {
		this.expstarttime = expstarttime;
		this.sercd = sercd;
		this.exptype = exptype;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "expcd", unique = true, nullable = false)

	public Integer getExpcd() {
		return this.expcd;
	}

	public void setExpcd(Integer expcd) {
		this.expcd = expcd;
	}

	@Column(name = "expstarttime", length = 8)

	public String getExpstarttime() {
		return this.expstarttime;
	}

	public void setExpstarttime(String expstarttime) {
		this.expstarttime = expstarttime;
	}

	@Column(name = "sercd", length = 10)

	public String getSercd() {
		return this.sercd;
	}

	public void setSercd(String sercd) {
		this.sercd = sercd;
	}

	@Column(name = "exptype", length = 1)

	public String getExptype() {
		return this.exptype;
	}

	public void setExptype(String exptype) {
		this.exptype = exptype;
	}

}