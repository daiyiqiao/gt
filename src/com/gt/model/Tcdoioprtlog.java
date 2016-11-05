package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tcdoioprtlog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tcdoioprtlog", schema = "public")

public class Tcdoioprtlog implements java.io.Serializable {

	// Fields

	private TcdoioprtlogId id;
	private Integer loginnum;
	private Integer regnum;
	private Integer modnum;
	private Integer ananum;
	private Integer crtusrid;
	private Integer updtusrid;
	private Timestamp crttime;
	private Timestamp updttime;
	private Integer revananum;
	private Integer delnum;
	private Integer urlmodnum;

	// Constructors

	/** default constructor */
	public Tcdoioprtlog() {
	}

	/** minimal constructor */
	public Tcdoioprtlog(TcdoioprtlogId id) {
		this.id = id;
	}

	/** full constructor */
	public Tcdoioprtlog(TcdoioprtlogId id, Integer loginnum, Integer regnum, Integer modnum, Integer ananum,
			Integer crtusrid, Integer updtusrid, Timestamp crttime, Timestamp updttime, Integer revananum,
			Integer delnum, Integer urlmodnum) {
		this.id = id;
		this.loginnum = loginnum;
		this.regnum = regnum;
		this.modnum = modnum;
		this.ananum = ananum;
		this.crtusrid = crtusrid;
		this.updtusrid = updtusrid;
		this.crttime = crttime;
		this.updttime = updttime;
		this.revananum = revananum;
		this.delnum = delnum;
		this.urlmodnum = urlmodnum;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "sercd", column = @Column(name = "sercd", nullable = false) ),
			@AttributeOverride(name = "optdate", column = @Column(name = "optdate", nullable = false, length = 8) ) })

	public TcdoioprtlogId getId() {
		return this.id;
	}

	public void setId(TcdoioprtlogId id) {
		this.id = id;
	}

	@Column(name = "loginnum")

	public Integer getLoginnum() {
		return this.loginnum;
	}

	public void setLoginnum(Integer loginnum) {
		this.loginnum = loginnum;
	}

	@Column(name = "regnum")

	public Integer getRegnum() {
		return this.regnum;
	}

	public void setRegnum(Integer regnum) {
		this.regnum = regnum;
	}

	@Column(name = "modnum")

	public Integer getModnum() {
		return this.modnum;
	}

	public void setModnum(Integer modnum) {
		this.modnum = modnum;
	}

	@Column(name = "ananum")

	public Integer getAnanum() {
		return this.ananum;
	}

	public void setAnanum(Integer ananum) {
		this.ananum = ananum;
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

	@Column(name = "revananum")

	public Integer getRevananum() {
		return this.revananum;
	}

	public void setRevananum(Integer revananum) {
		this.revananum = revananum;
	}

	@Column(name = "delnum")

	public Integer getDelnum() {
		return this.delnum;
	}

	public void setDelnum(Integer delnum) {
		this.delnum = delnum;
	}

	@Column(name = "urlmodnum")

	public Integer getUrlmodnum() {
		return this.urlmodnum;
	}

	public void setUrlmodnum(Integer urlmodnum) {
		this.urlmodnum = urlmodnum;
	}

}