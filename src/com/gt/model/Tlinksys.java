package com.gt.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tlinksys entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tlinksys", schema = "public")

public class Tlinksys implements java.io.Serializable {

	// Fields

	private String syscd;
	private String sysnm;
	private String delflg;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;
	private String upsyscd;
	private Set<Tmetadata> tmetadatas = new HashSet<Tmetadata>(0);

	// Constructors

	/** default constructor */
	public Tlinksys() {
	}

	/** minimal constructor */
	public Tlinksys(String delflg) {
		this.delflg = delflg;
	}

	/** full constructor */
	public Tlinksys(String sysnm, String delflg, Integer crtusrid, Timestamp crttime, Integer updtusrid,
			Timestamp updttime, String upsyscd, Set<Tmetadata> tmetadatas) {
		this.sysnm = sysnm;
		this.delflg = delflg;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
		this.upsyscd = upsyscd;
		this.tmetadatas = tmetadatas;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "syscd", unique = true, nullable = false, length = 32)

	public String getSyscd() {
		return this.syscd;
	}

	public void setSyscd(String syscd) {
		this.syscd = syscd;
	}

	@Column(name = "sysnm", length = 32)

	public String getSysnm() {
		return this.sysnm;
	}

	public void setSysnm(String sysnm) {
		this.sysnm = sysnm;
	}

	@Column(name = "delflg", nullable = false)

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

	@Column(name = "upsyscd", length = 32)

	public String getUpsyscd() {
		return this.upsyscd;
	}

	public void setUpsyscd(String upsyscd) {
		this.upsyscd = upsyscd;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tlinksys")

	public Set<Tmetadata> getTmetadatas() {
		return this.tmetadatas;
	}

	public void setTmetadatas(Set<Tmetadata> tmetadatas) {
		this.tmetadatas = tmetadatas;
	}

}