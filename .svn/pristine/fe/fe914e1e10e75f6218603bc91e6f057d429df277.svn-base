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
 * Torg entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "torg", schema = "public")

public class Torg implements java.io.Serializable {

	// Fields

	private String orgcd;
	private Tcdoistruct tcdoistruct;
	private String orgnm;
	private String orgadd;
	private String orgcontact;
	private String orgtel;
	private String regioncd;
	private String indcd;
	private String indprop;
	private String orgcdtmp;
	private String orgno;
	private String delflg;
	private Integer maxusrnum;
	private String orgstate;
	private Timestamp applytime;
	private Integer approvalusrid;
	private Timestamp approvaltime;
	private String zipcd;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;
	private Set<Tuser> tusers = new HashSet<Tuser>(0);

	// Constructors

	/** default constructor */
	public Torg() {
	}

	/** minimal constructor */
	public Torg(String delflg) {
		this.delflg = delflg;
	}

	/** full constructor */
	public Torg(Tcdoistruct tcdoistruct, String orgnm, String orgadd, String orgcontact, String orgtel, String regioncd,
			String indcd, String indprop, String orgcdtmp, String orgno, String delflg, Integer maxusrnum,
			String orgstate, Timestamp applytime, Integer approvalusrid, Timestamp approvaltime, String zipcd,
			Integer crtusrid, Timestamp crttime, Integer updtusrid, Timestamp updttime, Set<Tuser> tusers) {
		this.tcdoistruct = tcdoistruct;
		this.orgnm = orgnm;
		this.orgadd = orgadd;
		this.orgcontact = orgcontact;
		this.orgtel = orgtel;
		this.regioncd = regioncd;
		this.indcd = indcd;
		this.indprop = indprop;
		this.orgcdtmp = orgcdtmp;
		this.orgno = orgno;
		this.delflg = delflg;
		this.maxusrnum = maxusrnum;
		this.orgstate = orgstate;
		this.applytime = applytime;
		this.approvalusrid = approvalusrid;
		this.approvaltime = approvaltime;
		this.zipcd = zipcd;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
		this.tusers = tusers;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "orgcd", unique = true, nullable = false, length = 16)

	public String getOrgcd() {
		return this.orgcd;
	}

	public void setOrgcd(String orgcd) {
		this.orgcd = orgcd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sercd")

	public Tcdoistruct getTcdoistruct() {
		return this.tcdoistruct;
	}

	public void setTcdoistruct(Tcdoistruct tcdoistruct) {
		this.tcdoistruct = tcdoistruct;
	}

	@Column(name = "orgnm", length = 32)

	public String getOrgnm() {
		return this.orgnm;
	}

	public void setOrgnm(String orgnm) {
		this.orgnm = orgnm;
	}

	@Column(name = "orgadd", length = 32)

	public String getOrgadd() {
		return this.orgadd;
	}

	public void setOrgadd(String orgadd) {
		this.orgadd = orgadd;
	}

	@Column(name = "orgcontact", length = 16)

	public String getOrgcontact() {
		return this.orgcontact;
	}

	public void setOrgcontact(String orgcontact) {
		this.orgcontact = orgcontact;
	}

	@Column(name = "orgtel", length = 16)

	public String getOrgtel() {
		return this.orgtel;
	}

	public void setOrgtel(String orgtel) {
		this.orgtel = orgtel;
	}

	@Column(name = "regioncd", length = 6)

	public String getRegioncd() {
		return this.regioncd;
	}

	public void setRegioncd(String regioncd) {
		this.regioncd = regioncd;
	}

	@Column(name = "indcd", length = 4)

	public String getIndcd() {
		return this.indcd;
	}

	public void setIndcd(String indcd) {
		this.indcd = indcd;
	}

	@Column(name = "indprop", length = 2)

	public String getIndprop() {
		return this.indprop;
	}

	public void setIndprop(String indprop) {
		this.indprop = indprop;
	}

	@Column(name = "orgcdtmp", length = 12)

	public String getOrgcdtmp() {
		return this.orgcdtmp;
	}

	public void setOrgcdtmp(String orgcdtmp) {
		this.orgcdtmp = orgcdtmp;
	}

	@Column(name = "orgno", length = 4)

	public String getOrgno() {
		return this.orgno;
	}

	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}

	@Column(name = "delflg", nullable = false)

	public String getDelflg() {
		return this.delflg;
	}

	public void setDelflg(String delflg) {
		this.delflg = delflg;
	}

	@Column(name = "maxusrnum")

	public Integer getMaxusrnum() {
		return this.maxusrnum;
	}

	public void setMaxusrnum(Integer maxusrnum) {
		this.maxusrnum = maxusrnum;
	}

	@Column(name = "orgstate", length = 1)

	public String getOrgstate() {
		return this.orgstate;
	}

	public void setOrgstate(String orgstate) {
		this.orgstate = orgstate;
	}

	@Column(name = "applytime", length = 29)

	public Timestamp getApplytime() {
		return this.applytime;
	}

	public void setApplytime(Timestamp applytime) {
		this.applytime = applytime;
	}

	@Column(name = "approvalusrid")

	public Integer getApprovalusrid() {
		return this.approvalusrid;
	}

	public void setApprovalusrid(Integer approvalusrid) {
		this.approvalusrid = approvalusrid;
	}

	@Column(name = "approvaltime", length = 29)

	public Timestamp getApprovaltime() {
		return this.approvaltime;
	}

	public void setApprovaltime(Timestamp approvaltime) {
		this.approvaltime = approvaltime;
	}

	@Column(name = "zipcd", length = 6)

	public String getZipcd() {
		return this.zipcd;
	}

	public void setZipcd(String zipcd) {
		this.zipcd = zipcd;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torg")

	public Set<Tuser> getTusers() {
		return this.tusers;
	}

	public void setTusers(Set<Tuser> tusers) {
		this.tusers = tusers;
	}

}