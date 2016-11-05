package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tchkplanitm entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tchkplanitm", schema = "public")

public class Tchkplanitm implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tmetaitm tmetaitm;
	private Integer plancd;
	private String chkweight;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tchkplanitm() {
	}

	/** minimal constructor */
	public Tchkplanitm(Tmetaitm tmetaitm, Integer plancd) {
		this.tmetaitm = tmetaitm;
		this.plancd = plancd;
	}

	/** full constructor */
	public Tchkplanitm(Tmetaitm tmetaitm, Integer plancd, String chkweight, Integer crtusrid, Timestamp crttime,
			Integer updtusrid, Timestamp updttime) {
		this.tmetaitm = tmetaitm;
		this.plancd = plancd;
		this.chkweight = chkweight;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "metaitemno", nullable = false)

	public Tmetaitm getTmetaitm() {
		return this.tmetaitm;
	}

	public void setTmetaitm(Tmetaitm tmetaitm) {
		this.tmetaitm = tmetaitm;
	}

	@Column(name = "plancd", nullable = false)

	public Integer getPlancd() {
		return this.plancd;
	}

	public void setPlancd(Integer plancd) {
		this.plancd = plancd;
	}

	@Column(name = "chkweight", length = 1)

	public String getChkweight() {
		return this.chkweight;
	}

	public void setChkweight(String chkweight) {
		this.chkweight = chkweight;
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