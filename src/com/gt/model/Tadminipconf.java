package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tadminipconf entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tadminipconf", schema = "public")

public class Tadminipconf implements java.io.Serializable {

	// Fields

	private Integer confipid;
	private String startip;
	private String endip;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tadminipconf() {
	}

	/** full constructor */
	public Tadminipconf(String startip, String endip, Integer crtusrid, Timestamp crttime, Integer updtusrid,
			Timestamp updttime) {
		this.startip = startip;
		this.endip = endip;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "confipid", unique = true, nullable = false)

	public Integer getConfipid() {
		return this.confipid;
	}

	public void setConfipid(Integer confipid) {
		this.confipid = confipid;
	}

	@Column(name = "startip", length = 15)

	public String getStartip() {
		return this.startip;
	}

	public void setStartip(String startip) {
		this.startip = startip;
	}

	@Column(name = "endip", length = 15)

	public String getEndip() {
		return this.endip;
	}

	public void setEndip(String endip) {
		this.endip = endip;
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