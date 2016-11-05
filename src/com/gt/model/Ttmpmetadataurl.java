package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ttmpmetadataurl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ttmpmetadataurl", schema = "public")

public class Ttmpmetadataurl implements java.io.Serializable {

	// Fields

	private Integer mdataurlcd;
	private Integer sercd;
	private String cdoicd;
	private String befurl;
	private String crturl;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Ttmpmetadataurl() {
	}

	/** minimal constructor */
	public Ttmpmetadataurl(Integer sercd, String cdoicd) {
		this.sercd = sercd;
		this.cdoicd = cdoicd;
	}

	/** full constructor */
	public Ttmpmetadataurl(Integer sercd, String cdoicd, String befurl, String crturl, Integer crtusrid,
			Timestamp crttime, Integer updtusrid, Timestamp updttime) {
		this.sercd = sercd;
		this.cdoicd = cdoicd;
		this.befurl = befurl;
		this.crturl = crturl;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
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

	@Column(name = "sercd", nullable = false)

	public Integer getSercd() {
		return this.sercd;
	}

	public void setSercd(Integer sercd) {
		this.sercd = sercd;
	}

	@Column(name = "cdoicd", nullable = false, length = 256)

	public String getCdoicd() {
		return this.cdoicd;
	}

	public void setCdoicd(String cdoicd) {
		this.cdoicd = cdoicd;
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

}