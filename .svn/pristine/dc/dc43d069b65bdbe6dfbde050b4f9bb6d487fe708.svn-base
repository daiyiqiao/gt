package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tasynbatchprocess entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tasynbatchprocess", schema = "public")

public class Tasynbatchprocess implements java.io.Serializable {

	// Fields

	private Integer processid;
	private String trscd;
	private String filename;
	private String sourcefilename;
	private String syscd;
	private String prostate;
	private String oprtsubmdl;
	private String orgcd;
	private String loginid;
	private Integer sercd;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tasynbatchprocess() {
	}

	/** minimal constructor */
	public Tasynbatchprocess(Integer crtusrid, Timestamp crttime) {
		this.crtusrid = crtusrid;
		this.crttime = crttime;
	}

	/** full constructor */
	public Tasynbatchprocess(String trscd, String filename, String sourcefilename, String syscd, String prostate,
			String oprtsubmdl, String orgcd, String loginid, Integer sercd, Integer crtusrid, Timestamp crttime,
			Integer updtusrid, Timestamp updttime) {
		this.trscd = trscd;
		this.filename = filename;
		this.sourcefilename = sourcefilename;
		this.syscd = syscd;
		this.prostate = prostate;
		this.oprtsubmdl = oprtsubmdl;
		this.orgcd = orgcd;
		this.loginid = loginid;
		this.sercd = sercd;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "processid", unique = true, nullable = false)

	public Integer getProcessid() {
		return this.processid;
	}

	public void setProcessid(Integer processid) {
		this.processid = processid;
	}

	@Column(name = "trscd", length = 18)

	public String getTrscd() {
		return this.trscd;
	}

	public void setTrscd(String trscd) {
		this.trscd = trscd;
	}

	@Column(name = "filename", length = 64)

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Column(name = "sourcefilename", length = 64)

	public String getSourcefilename() {
		return this.sourcefilename;
	}

	public void setSourcefilename(String sourcefilename) {
		this.sourcefilename = sourcefilename;
	}

	@Column(name = "syscd", length = 3)

	public String getSyscd() {
		return this.syscd;
	}

	public void setSyscd(String syscd) {
		this.syscd = syscd;
	}

	@Column(name = "prostate", length = 1)

	public String getProstate() {
		return this.prostate;
	}

	public void setProstate(String prostate) {
		this.prostate = prostate;
	}

	@Column(name = "oprtsubmdl", length = 5)

	public String getOprtsubmdl() {
		return this.oprtsubmdl;
	}

	public void setOprtsubmdl(String oprtsubmdl) {
		this.oprtsubmdl = oprtsubmdl;
	}

	@Column(name = "orgcd", length = 16)

	public String getOrgcd() {
		return this.orgcd;
	}

	public void setOrgcd(String orgcd) {
		this.orgcd = orgcd;
	}

	@Column(name = "loginid", length = 32)

	public String getLoginid() {
		return this.loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	@Column(name = "sercd")

	public Integer getSercd() {
		return this.sercd;
	}

	public void setSercd(Integer sercd) {
		this.sercd = sercd;
	}

	@Column(name = "crtusrid", nullable = false)

	public Integer getCrtusrid() {
		return this.crtusrid;
	}

	public void setCrtusrid(Integer crtusrid) {
		this.crtusrid = crtusrid;
	}

	@Column(name = "crttime", nullable = false, length = 29)

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