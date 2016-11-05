package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tregion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tregion", schema = "public")

public class Tregion implements java.io.Serializable {

	// Fields

	private String regioncd;
	private String regionnm;
	private String regionlvl;
	private String pregioncd;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tregion() {
	}

	/** full constructor */
	public Tregion(String regionnm, String regionlvl, String pregioncd, Integer crtusrid, Timestamp crttime,
			Integer updtusrid, Timestamp updttime) {
		this.regionnm = regionnm;
		this.regionlvl = regionlvl;
		this.pregioncd = pregioncd;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "regioncd", unique = true, nullable = false, length = 6)

	public String getRegioncd() {
		return this.regioncd;
	}

	public void setRegioncd(String regioncd) {
		this.regioncd = regioncd;
	}

	@Column(name = "regionnm", length = 16)

	public String getRegionnm() {
		return this.regionnm;
	}

	public void setRegionnm(String regionnm) {
		this.regionnm = regionnm;
	}

	@Column(name = "regionlvl", length = 1)

	public String getRegionlvl() {
		return this.regionlvl;
	}

	public void setRegionlvl(String regionlvl) {
		this.regionlvl = regionlvl;
	}

	@Column(name = "pregioncd", length = 6)

	public String getPregioncd() {
		return this.pregioncd;
	}

	public void setPregioncd(String pregioncd) {
		this.pregioncd = pregioncd;
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