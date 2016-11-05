package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Toprtlog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "toprtlog", schema = "public")

public class Toprtlog implements java.io.Serializable {

	// Fields

	private Integer oprtid;
	private String trscd;
	private Integer oprtusrid;
	private String orgcd;
	private String oprtmdl;
	private String oprtfunctncd;
	private String oprtcntnt;
	private Timestamp oprttm;
	private String oprtip;
	private Integer crtusrid;
	private Integer updtusrid;
	private Timestamp crttime;
	private Timestamp updttime;
	private String linksyscd;
	private Integer oprtmetadatanum;
	private String oprtsubmdl;
	private Integer oprtalldatanum;

	// Constructors

	/** default constructor */
	public Toprtlog() {
	}

	/** full constructor */
	public Toprtlog(String trscd, Integer oprtusrid, String orgcd, String oprtmdl, String oprtfunctncd,
			String oprtcntnt, Timestamp oprttm, String oprtip, Integer crtusrid, Integer updtusrid, Timestamp crttime,
			Timestamp updttime, String linksyscd, Integer oprtmetadatanum, String oprtsubmdl, Integer oprtalldatanum) {
		this.trscd = trscd;
		this.oprtusrid = oprtusrid;
		this.orgcd = orgcd;
		this.oprtmdl = oprtmdl;
		this.oprtfunctncd = oprtfunctncd;
		this.oprtcntnt = oprtcntnt;
		this.oprttm = oprttm;
		this.oprtip = oprtip;
		this.crtusrid = crtusrid;
		this.updtusrid = updtusrid;
		this.crttime = crttime;
		this.updttime = updttime;
		this.linksyscd = linksyscd;
		this.oprtmetadatanum = oprtmetadatanum;
		this.oprtsubmdl = oprtsubmdl;
		this.oprtalldatanum = oprtalldatanum;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "oprtid", unique = true, nullable = false)

	public Integer getOprtid() {
		return this.oprtid;
	}

	public void setOprtid(Integer oprtid) {
		this.oprtid = oprtid;
	}

	@Column(name = "trscd", length = 18)

	public String getTrscd() {
		return this.trscd;
	}

	public void setTrscd(String trscd) {
		this.trscd = trscd;
	}

	@Column(name = "oprtusrid")

	public Integer getOprtusrid() {
		return this.oprtusrid;
	}

	public void setOprtusrid(Integer oprtusrid) {
		this.oprtusrid = oprtusrid;
	}

	@Column(name = "orgcd", length = 16)

	public String getOrgcd() {
		return this.orgcd;
	}

	public void setOrgcd(String orgcd) {
		this.orgcd = orgcd;
	}

	@Column(name = "oprtmdl", length = 20)

	public String getOprtmdl() {
		return this.oprtmdl;
	}

	public void setOprtmdl(String oprtmdl) {
		this.oprtmdl = oprtmdl;
	}

	@Column(name = "oprtfunctncd", length = 64)

	public String getOprtfunctncd() {
		return this.oprtfunctncd;
	}

	public void setOprtfunctncd(String oprtfunctncd) {
		this.oprtfunctncd = oprtfunctncd;
	}

	@Column(name = "oprtcntnt", length = 1024)

	public String getOprtcntnt() {
		return this.oprtcntnt;
	}

	public void setOprtcntnt(String oprtcntnt) {
		this.oprtcntnt = oprtcntnt;
	}

	@Column(name = "oprttm", length = 29)

	public Timestamp getOprttm() {
		return this.oprttm;
	}

	public void setOprttm(Timestamp oprttm) {
		this.oprttm = oprttm;
	}

	@Column(name = "oprtip", length = 50)

	public String getOprtip() {
		return this.oprtip;
	}

	public void setOprtip(String oprtip) {
		this.oprtip = oprtip;
	}

	@Column(name = "crtusrid")

	public Integer getCrtusrid() {
		return this.crtusrid;
	}

	public void setCrtusrid(Integer crtusrid) {
		this.crtusrid = crtusrid;
	}

	@Column(name = "updtusrid")

	public Integer getUpdtusrid() {
		return this.updtusrid;
	}

	public void setUpdtusrid(Integer updtusrid) {
		this.updtusrid = updtusrid;
	}

	@Column(name = "crttime", length = 29)

	public Timestamp getCrttime() {
		return this.crttime;
	}

	public void setCrttime(Timestamp crttime) {
		this.crttime = crttime;
	}

	@Column(name = "updttime", length = 29)

	public Timestamp getUpdttime() {
		return this.updttime;
	}

	public void setUpdttime(Timestamp updttime) {
		this.updttime = updttime;
	}

	@Column(name = "linksyscd", length = 3)

	public String getLinksyscd() {
		return this.linksyscd;
	}

	public void setLinksyscd(String linksyscd) {
		this.linksyscd = linksyscd;
	}

	@Column(name = "oprtmetadatanum")

	public Integer getOprtmetadatanum() {
		return this.oprtmetadatanum;
	}

	public void setOprtmetadatanum(Integer oprtmetadatanum) {
		this.oprtmetadatanum = oprtmetadatanum;
	}

	@Column(name = "oprtsubmdl", length = 5)

	public String getOprtsubmdl() {
		return this.oprtsubmdl;
	}

	public void setOprtsubmdl(String oprtsubmdl) {
		this.oprtsubmdl = oprtsubmdl;
	}

	@Column(name = "oprtalldatanum")

	public Integer getOprtalldatanum() {
		return this.oprtalldatanum;
	}

	public void setOprtalldatanum(Integer oprtalldatanum) {
		this.oprtalldatanum = oprtalldatanum;
	}

}