package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tgranularityrule entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tgranularityrule", schema = "public")

public class Tgranularityrule implements java.io.Serializable {

	// Fields

	private Integer ruleid;
	private String resourcetype;
	private String granularitysite;
	private String isrepeat;
	private String granularitycd;
	private String granularitynm;
	private String granularityrule;
	private String granularityrulea;
	private String issingle;
	private String weight;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tgranularityrule() {
	}

	/** full constructor */
	public Tgranularityrule(String resourcetype, String granularitysite, String isrepeat, String granularitycd,
			String granularitynm, String granularityrule, String granularityrulea, String issingle, String weight,
			Integer crtusrid, Timestamp crttime, Integer updtusrid, Timestamp updttime) {
		this.resourcetype = resourcetype;
		this.granularitysite = granularitysite;
		this.isrepeat = isrepeat;
		this.granularitycd = granularitycd;
		this.granularitynm = granularitynm;
		this.granularityrule = granularityrule;
		this.granularityrulea = granularityrulea;
		this.issingle = issingle;
		this.weight = weight;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "ruleid", unique = true, nullable = false)

	public Integer getRuleid() {
		return this.ruleid;
	}

	public void setRuleid(Integer ruleid) {
		this.ruleid = ruleid;
	}

	@Column(name = "resourcetype", length = 3)

	public String getResourcetype() {
		return this.resourcetype;
	}

	public void setResourcetype(String resourcetype) {
		this.resourcetype = resourcetype;
	}

	@Column(name = "granularitysite", length = 2)

	public String getGranularitysite() {
		return this.granularitysite;
	}

	public void setGranularitysite(String granularitysite) {
		this.granularitysite = granularitysite;
	}

	@Column(name = "isrepeat", length = 1)

	public String getIsrepeat() {
		return this.isrepeat;
	}

	public void setIsrepeat(String isrepeat) {
		this.isrepeat = isrepeat;
	}

	@Column(name = "granularitycd", length = 8)

	public String getGranularitycd() {
		return this.granularitycd;
	}

	public void setGranularitycd(String granularitycd) {
		this.granularitycd = granularitycd;
	}

	@Column(name = "granularitynm", length = 16)

	public String getGranularitynm() {
		return this.granularitynm;
	}

	public void setGranularitynm(String granularitynm) {
		this.granularitynm = granularitynm;
	}

	@Column(name = "granularityrule", length = 16)

	public String getGranularityrule() {
		return this.granularityrule;
	}

	public void setGranularityrule(String granularityrule) {
		this.granularityrule = granularityrule;
	}

	@Column(name = "granularityrulea", length = 1)

	public String getGranularityrulea() {
		return this.granularityrulea;
	}

	public void setGranularityrulea(String granularityrulea) {
		this.granularityrulea = granularityrulea;
	}

	@Column(name = "issingle", length = 1)

	public String getIssingle() {
		return this.issingle;
	}

	public void setIssingle(String issingle) {
		this.issingle = issingle;
	}

	@Column(name = "weight", length = 2)

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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