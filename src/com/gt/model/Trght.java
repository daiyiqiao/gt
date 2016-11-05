package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Trght entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trght", schema = "public")

public class Trght implements java.io.Serializable {

	// Fields

	private TrghtId id;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Trght() {
	}

	/** minimal constructor */
	public Trght(TrghtId id) {
		this.id = id;
	}

	/** full constructor */
	public Trght(TrghtId id, Integer crtusrid, Timestamp crttime, Integer updtusrid, Timestamp updttime) {
		this.id = id;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "roleid", column = @Column(name = "roleid", nullable = false) ),
			@AttributeOverride(name = "functncd", column = @Column(name = "functncd", nullable = false, length = 4) ) })

	public TrghtId getId() {
		return this.id;
	}

	public void setId(TrghtId id) {
		this.id = id;
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