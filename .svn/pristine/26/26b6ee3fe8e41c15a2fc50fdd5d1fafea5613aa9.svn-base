package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tchkplan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tchkplan", schema = "public")

public class Tchkplan implements java.io.Serializable {

	// Fields

	private Integer plancd;
	private String plannm;
	private Integer repeatnum;
	private String delflg;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tchkplan() {
	}

	/** full constructor */
	public Tchkplan(String plannm, Integer repeatnum, String delflg, Integer crtusrid, Timestamp crttime,
			Integer updtusrid, Timestamp updttime) {
		this.plannm = plannm;
		this.repeatnum = repeatnum;
		this.delflg = delflg;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "plancd", unique = true, nullable = false)

	public Integer getPlancd() {
		return this.plancd;
	}

	public void setPlancd(Integer plancd) {
		this.plancd = plancd;
	}

	@Column(name = "plannm", length = 16)

	public String getPlannm() {
		return this.plannm;
	}

	public void setPlannm(String plannm) {
		this.plannm = plannm;
	}

	@Column(name = "repeatnum")

	public Integer getRepeatnum() {
		return this.repeatnum;
	}

	public void setRepeatnum(Integer repeatnum) {
		this.repeatnum = repeatnum;
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