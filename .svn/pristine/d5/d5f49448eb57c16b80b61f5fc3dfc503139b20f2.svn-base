package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tdict entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tdict", schema = "public")

public class Tdict implements java.io.Serializable {

	// Fields

	private TdictId id;
	private String dictcntnt;
	private String fieldnm;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tdict() {
	}

	/** minimal constructor */
	public Tdict(TdictId id) {
		this.id = id;
	}

	/** full constructor */
	public Tdict(TdictId id, String dictcntnt, String fieldnm, Integer crtusrid, Timestamp crttime, Integer updtusrid,
			Timestamp updttime) {
		this.id = id;
		this.dictcntnt = dictcntnt;
		this.fieldnm = fieldnm;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "dictfield", column = @Column(name = "dictfield", nullable = false, length = 16) ),
			@AttributeOverride(name = "dictcd", column = @Column(name = "dictcd", nullable = false, length = 8) ) })

	public TdictId getId() {
		return this.id;
	}

	public void setId(TdictId id) {
		this.id = id;
	}

	@Column(name = "dictcntnt", length = 32)

	public String getDictcntnt() {
		return this.dictcntnt;
	}

	public void setDictcntnt(String dictcntnt) {
		this.dictcntnt = dictcntnt;
	}

	@Column(name = "fieldnm", length = 16)

	public String getFieldnm() {
		return this.fieldnm;
	}

	public void setFieldnm(String fieldnm) {
		this.fieldnm = fieldnm;
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