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
 * Tmetadataurl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmetadataurl", schema = "public")

public class Tmetadataurl implements java.io.Serializable {

	// Fields

	private Integer mdataurlcd;
	private Tmetadata tmetadata;
	private Integer sercd;
	private String befurl;
	private String crturl;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;
	private String stateflg;
	private Timestamp systime;

	// Constructors

	/** default constructor */
	public Tmetadataurl() {
	}

	/** minimal constructor */
	public Tmetadataurl(Tmetadata tmetadata, Integer sercd) {
		this.tmetadata = tmetadata;
		this.sercd = sercd;
	}

	/** full constructor */
	public Tmetadataurl(Tmetadata tmetadata, Integer sercd, String befurl, String crturl, Integer crtusrid,
			Timestamp crttime, Integer updtusrid, Timestamp updttime, String stateflg, Timestamp systime) {
		this.tmetadata = tmetadata;
		this.sercd = sercd;
		this.befurl = befurl;
		this.crturl = crturl;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
		this.stateflg = stateflg;
		this.systime = systime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "mdataurlcd", unique = true, nullable = false)

	public Integer getMdataurlcd() {
		return this.mdataurlcd;
	}

	public void setMdataurlcd(Integer mdataurlcd) {
		this.mdataurlcd = mdataurlcd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cdoicd", nullable = false)

	public Tmetadata getTmetadata() {
		return this.tmetadata;
	}

	public void setTmetadata(Tmetadata tmetadata) {
		this.tmetadata = tmetadata;
	}

	@Column(name = "sercd", nullable = false)

	public Integer getSercd() {
		return this.sercd;
	}

	public void setSercd(Integer sercd) {
		this.sercd = sercd;
	}

	@Column(name = "befurl", length = 512)

	public String getBefurl() {
		return this.befurl;
	}

	public void setBefurl(String befurl) {
		this.befurl = befurl;
	}

	@Column(name = "crturl", length = 512)

	public String getCrturl() {
		return this.crturl;
	}

	public void setCrturl(String crturl) {
		this.crturl = crturl;
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

	@Column(name = "stateflg", length = 2)

	public String getStateflg() {
		return this.stateflg;
	}

	public void setStateflg(String stateflg) {
		this.stateflg = stateflg;
	}

	@Column(name = "systime", length = 29)

	public Timestamp getSystime() {
		return this.systime;
	}

	public void setSystime(Timestamp systime) {
		this.systime = systime;
	}

}