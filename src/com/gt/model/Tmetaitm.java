package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tmetaitm entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmetaitm", schema = "public")

public class Tmetaitm implements java.io.Serializable {

	// Fields

	private Integer metaitemno;
	private String itemfield;
	private String mustflg;
	private String itemnm;
	private String useflg;
	private String delflg;
	private String dictflg;
	private String inputflg;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tmetaitm() {
	}

	/** full constructor */
	public Tmetaitm(String itemfield, String mustflg, String itemnm, String useflg, String delflg, String dictflg,
			String inputflg, Integer crtusrid, Timestamp crttime, Integer updtusrid, Timestamp updttime) {
		this.itemfield = itemfield;
		this.mustflg = mustflg;
		this.itemnm = itemnm;
		this.useflg = useflg;
		this.delflg = delflg;
		this.dictflg = dictflg;
		this.inputflg = inputflg;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "metaitemno", unique = true, nullable = false)

	public Integer getMetaitemno() {
		return this.metaitemno;
	}

	public void setMetaitemno(Integer metaitemno) {
		this.metaitemno = metaitemno;
	}

	@Column(name = "itemfield", length = 32)

	public String getItemfield() {
		return this.itemfield;
	}

	public void setItemfield(String itemfield) {
		this.itemfield = itemfield;
	}

	@Column(name = "mustflg", length = 1)

	public String getMustflg() {
		return this.mustflg;
	}

	public void setMustflg(String mustflg) {
		this.mustflg = mustflg;
	}

	@Column(name = "itemnm", length = 16)

	public String getItemnm() {
		return this.itemnm;
	}

	public void setItemnm(String itemnm) {
		this.itemnm = itemnm;
	}

	@Column(name = "useflg", length = 1)

	public String getUseflg() {
		return this.useflg;
	}

	public void setUseflg(String useflg) {
		this.useflg = useflg;
	}

	@Column(name = "delflg", length = 1)

	public String getDelflg() {
		return this.delflg;
	}

	public void setDelflg(String delflg) {
		this.delflg = delflg;
	}

	@Column(name = "dictflg", length = 1)

	public String getDictflg() {
		return this.dictflg;
	}

	public void setDictflg(String dictflg) {
		this.dictflg = dictflg;
	}

	@Column(name = "inputflg", length = 1)

	public String getInputflg() {
		return this.inputflg;
	}

	public void setInputflg(String inputflg) {
		this.inputflg = inputflg;
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