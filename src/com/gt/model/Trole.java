package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Trole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trole", schema = "public")

public class Trole implements java.io.Serializable {

	// Fields

	private Integer roleid;
	private String rolenm;
	private String rolecmmt;
	private String delflg;
	private String serflg;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Trole() {
	}

	/** full constructor */
	public Trole(String rolenm, String rolecmmt, String delflg, String serflg, Integer crtusrid, Timestamp crttime,
			Integer updtusrid, Timestamp updttime) {
		this.rolenm = rolenm;
		this.rolecmmt = rolecmmt;
		this.delflg = delflg;
		this.serflg = serflg;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "roleid", unique = true, nullable = false)

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	@Column(name = "rolenm", length = 16)

	public String getRolenm() {
		return this.rolenm;
	}

	public void setRolenm(String rolenm) {
		this.rolenm = rolenm;
	}

	@Column(name = "rolecmmt", length = 64)

	public String getRolecmmt() {
		return this.rolecmmt;
	}

	public void setRolecmmt(String rolecmmt) {
		this.rolecmmt = rolecmmt;
	}

	@Column(name = "delflg", length = 1)

	public String getDelflg() {
		return this.delflg;
	}

	public void setDelflg(String delflg) {
		this.delflg = delflg;
	}

	@Column(name = "serflg", length = 1)

	public String getSerflg() {
		return this.serflg;
	}

	public void setSerflg(String serflg) {
		this.serflg = serflg;
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