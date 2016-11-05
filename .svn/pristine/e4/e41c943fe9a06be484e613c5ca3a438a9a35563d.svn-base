package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tchkplanrs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tchkplanrs", schema = "public")

public class Tchkplanrs implements java.io.Serializable {

	// Fields

	private TchkplanrsId id;
	private String cdoicd;
	private String calmd5;
	private String datanmset;
	private String orgcd;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tchkplanrs() {
	}

	/** minimal constructor */
	public Tchkplanrs(TchkplanrsId id, String cdoicd, String orgcd) {
		this.id = id;
		this.cdoicd = cdoicd;
		this.orgcd = orgcd;
	}

	/** full constructor */
	public Tchkplanrs(TchkplanrsId id, String cdoicd, String calmd5, String datanmset, String orgcd, Integer crtusrid,
			Timestamp crttime, Integer updtusrid, Timestamp updttime) {
		this.id = id;
		this.cdoicd = cdoicd;
		this.calmd5 = calmd5;
		this.datanmset = datanmset;
		this.orgcd = orgcd;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "mdatacd", column = @Column(name = "mdatacd", nullable = false) ),
			@AttributeOverride(name = "calno", column = @Column(name = "calno", nullable = false) ) })

	public TchkplanrsId getId() {
		return this.id;
	}

	public void setId(TchkplanrsId id) {
		this.id = id;
	}

	@Column(name = "cdoicd", nullable = false, length = 256)

	public String getCdoicd() {
		return this.cdoicd;
	}

	public void setCdoicd(String cdoicd) {
		this.cdoicd = cdoicd;
	}

	@Column(name = "calmd5", length = 32)

	public String getCalmd5() {
		return this.calmd5;
	}

	public void setCalmd5(String calmd5) {
		this.calmd5 = calmd5;
	}

	@Column(name = "datanmset", length = 32)

	public String getDatanmset() {
		return this.datanmset;
	}

	public void setDatanmset(String datanmset) {
		this.datanmset = datanmset;
	}

	@Column(name = "orgcd", nullable = false, length = 16)

	public String getOrgcd() {
		return this.orgcd;
	}

	public void setOrgcd(String orgcd) {
		this.orgcd = orgcd;
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