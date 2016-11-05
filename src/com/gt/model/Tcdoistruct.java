package com.gt.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tcdoistruct entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tcdoistruct", schema = "public")

public class Tcdoistruct implements java.io.Serializable {

	// Fields

	private Integer sercd;
	private String sernm;
	private String sercfgf;
	private String sercfg;
	private String chkcode;
	private Integer psercd;
	private String ctrycd;
	private String libcd;
	private String remark;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;
	private String revanaserflg;
	private String serdomain;
	private String granularitycheck;
	private Set<Torg> torgs = new HashSet<Torg>(0);

	// Constructors

	/** default constructor */
	public Tcdoistruct() {
	}

	/** minimal constructor */
	public Tcdoistruct(String ctrycd, String libcd) {
		this.ctrycd = ctrycd;
		this.libcd = libcd;
	}

	/** full constructor */
	public Tcdoistruct(String sernm, String sercfgf, String sercfg, String chkcode, Integer psercd, String ctrycd,
			String libcd, String remark, Integer crtusrid, Timestamp crttime, Integer updtusrid, Timestamp updttime,
			String revanaserflg, String serdomain, String granularitycheck, Set<Torg> torgs) {
		this.sernm = sernm;
		this.sercfgf = sercfgf;
		this.sercfg = sercfg;
		this.chkcode = chkcode;
		this.psercd = psercd;
		this.ctrycd = ctrycd;
		this.libcd = libcd;
		this.remark = remark;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
		this.revanaserflg = revanaserflg;
		this.serdomain = serdomain;
		this.granularitycheck = granularitycheck;
		this.torgs = torgs;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "sercd", unique = true, nullable = false)

	public Integer getSercd() {
		return this.sercd;
	}

	public void setSercd(Integer sercd) {
		this.sercd = sercd;
	}

	@Column(name = "sernm", length = 16)

	public String getSernm() {
		return this.sernm;
	}

	public void setSernm(String sernm) {
		this.sernm = sernm;
	}

	@Column(name = "sercfgf", length = 64)

	public String getSercfgf() {
		return this.sercfgf;
	}

	public void setSercfgf(String sercfgf) {
		this.sercfgf = sercfgf;
	}

	@Column(name = "sercfg", length = 64)

	public String getSercfg() {
		return this.sercfg;
	}

	public void setSercfg(String sercfg) {
		this.sercfg = sercfg;
	}

	@Column(name = "chkcode", length = 8)

	public String getChkcode() {
		return this.chkcode;
	}

	public void setChkcode(String chkcode) {
		this.chkcode = chkcode;
	}

	@Column(name = "psercd")

	public Integer getPsercd() {
		return this.psercd;
	}

	public void setPsercd(Integer psercd) {
		this.psercd = psercd;
	}

	@Column(name = "ctrycd", nullable = false)

	public String getCtrycd() {
		return this.ctrycd;
	}

	public void setCtrycd(String ctrycd) {
		this.ctrycd = ctrycd;
	}

	@Column(name = "libcd", nullable = false, length = 16)

	public String getLibcd() {
		return this.libcd;
	}

	public void setLibcd(String libcd) {
		this.libcd = libcd;
	}

	@Column(name = "remark", length = 256)

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	@Column(name = "revanaserflg", length = 1)

	public String getRevanaserflg() {
		return this.revanaserflg;
	}

	public void setRevanaserflg(String revanaserflg) {
		this.revanaserflg = revanaserflg;
	}

	@Column(name = "serdomain", length = 32)

	public String getSerdomain() {
		return this.serdomain;
	}

	public void setSerdomain(String serdomain) {
		this.serdomain = serdomain;
	}

	@Column(name = "granularitycheck", length = 64)

	public String getGranularitycheck() {
		return this.granularitycheck;
	}

	public void setGranularitycheck(String granularitycheck) {
		this.granularitycheck = granularitycheck;
	}

	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tcdoistruct")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tcdoistruct")

	public Set<Torg> getTorgs() {
		return this.torgs;
	}

	public void setTorgs(Set<Torg> torgs) {
		this.torgs = torgs;
	}

}