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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Trestype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trestype", schema = "public")

public class Trestype implements java.io.Serializable {

	// Fields

	private String tcd;
	private Tchkplan tchkplan;
	private String tnm;
	private String delflg;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;
	private Set<Tmetadata> tmetadatas = new HashSet<Tmetadata>(0);

	// Constructors

	/** default constructor */
	public Trestype() {
	}

	/** minimal constructor */
	public Trestype(String tnm, String delflg) {
		this.tnm = tnm;
		this.delflg = delflg;
	}

	/** full constructor */
	public Trestype(Tchkplan tchkplan, String tnm, String delflg, Integer crtusrid, Timestamp crttime,
			Integer updtusrid, Timestamp updttime, Set<Tmetadata> tmetadatas) {
		this.tchkplan = tchkplan;
		this.tnm = tnm;
		this.delflg = delflg;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
		this.tmetadatas = tmetadatas;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "tcd", unique = true, nullable = false, length = 3)

	public String getTcd() {
		return this.tcd;
	}

	public void setTcd(String tcd) {
		this.tcd = tcd;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "plancd")

	public Tchkplan getTchkplan() {
		return this.tchkplan;
	}

	public void setTchkplan(Tchkplan tchkplan) {
		this.tchkplan = tchkplan;
	}

	@Column(name = "tnm", nullable = false, length = 8)

	public String getTnm() {
		return this.tnm;
	}

	public void setTnm(String tnm) {
		this.tnm = tnm;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trestype")

	public Set<Tmetadata> getTmetadatas() {
		return this.tmetadatas;
	}

	public void setTmetadatas(Set<Tmetadata> tmetadatas) {
		this.tmetadatas = tmetadatas;
	}

}