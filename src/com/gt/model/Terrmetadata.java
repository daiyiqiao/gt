package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Terrmetadata entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "terrmetadata", schema = "public")

public class Terrmetadata implements java.io.Serializable {

	// Fields

	private Integer mdatacd;
	private String trscd;
	private String cdoicd;
	private String fcd;
	private String tcd;
	private String syscd;
	private String sysinid;
	private String marccd;
	private String title;
	private String creator;
	private String isbn;
	private String issn;
	private String lang;
	private String pub;
	private String pubdate;
	private String granule1;
	private String granule2;
	private String granule3;
	private String granule1val;
	private String granule2val;
	private String granule3val;
	private String objdesc;
	private String objsource;
	private String assinfo;
	private String orgcd;
	private Integer errrowno;
	private String errdesc;
	private String expndfield1;
	private String expndfield2;
	private String expndfield3;
	private String expndfield4;
	private String expndfield5;
	private String expndfield6;
	private String expndfield7;
	private String expndfield8;
	private String expndfield9;
	private String expndfield10;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Terrmetadata() {
	}

	/** minimal constructor */
	public Terrmetadata(String orgcd) {
		this.orgcd = orgcd;
	}

	/** full constructor */
	public Terrmetadata(String trscd, String cdoicd, String fcd, String tcd, String syscd, String sysinid,
			String marccd, String title, String creator, String isbn, String issn, String lang, String pub,
			String pubdate, String granule1, String granule2, String granule3, String granule1val, String granule2val,
			String granule3val, String objdesc, String objsource, String assinfo, String orgcd, Integer errrowno,
			String errdesc, String expndfield1, String expndfield2, String expndfield3, String expndfield4,
			String expndfield5, String expndfield6, String expndfield7, String expndfield8, String expndfield9,
			String expndfield10, Integer crtusrid, Timestamp crttime, Integer updtusrid, Timestamp updttime) {
		this.trscd = trscd;
		this.cdoicd = cdoicd;
		this.fcd = fcd;
		this.tcd = tcd;
		this.syscd = syscd;
		this.sysinid = sysinid;
		this.marccd = marccd;
		this.title = title;
		this.creator = creator;
		this.isbn = isbn;
		this.issn = issn;
		this.lang = lang;
		this.pub = pub;
		this.pubdate = pubdate;
		this.granule1 = granule1;
		this.granule2 = granule2;
		this.granule3 = granule3;
		this.granule1val = granule1val;
		this.granule2val = granule2val;
		this.granule3val = granule3val;
		this.objdesc = objdesc;
		this.objsource = objsource;
		this.assinfo = assinfo;
		this.orgcd = orgcd;
		this.errrowno = errrowno;
		this.errdesc = errdesc;
		this.expndfield1 = expndfield1;
		this.expndfield2 = expndfield2;
		this.expndfield3 = expndfield3;
		this.expndfield4 = expndfield4;
		this.expndfield5 = expndfield5;
		this.expndfield6 = expndfield6;
		this.expndfield7 = expndfield7;
		this.expndfield8 = expndfield8;
		this.expndfield9 = expndfield9;
		this.expndfield10 = expndfield10;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "mdatacd", unique = true, nullable = false)

	public Integer getMdatacd() {
		return this.mdatacd;
	}

	public void setMdatacd(Integer mdatacd) {
		this.mdatacd = mdatacd;
	}

	@Column(name = "trscd", length = 18)

	public String getTrscd() {
		return this.trscd;
	}

	public void setTrscd(String trscd) {
		this.trscd = trscd;
	}

	@Column(name = "cdoicd", length = 256)

	public String getCdoicd() {
		return this.cdoicd;
	}

	public void setCdoicd(String cdoicd) {
		this.cdoicd = cdoicd;
	}

	@Column(name = "fcd", length = 3)

	public String getFcd() {
		return this.fcd;
	}

	public void setFcd(String fcd) {
		this.fcd = fcd;
	}

	@Column(name = "tcd", length = 3)

	public String getTcd() {
		return this.tcd;
	}

	public void setTcd(String tcd) {
		this.tcd = tcd;
	}

	@Column(name = "syscd", length = 3)

	public String getSyscd() {
		return this.syscd;
	}

	public void setSyscd(String syscd) {
		this.syscd = syscd;
	}

	@Column(name = "sysinid", length = 16)

	public String getSysinid() {
		return this.sysinid;
	}

	public void setSysinid(String sysinid) {
		this.sysinid = sysinid;
	}

	@Column(name = "marccd", length = 16)

	public String getMarccd() {
		return this.marccd;
	}

	public void setMarccd(String marccd) {
		this.marccd = marccd;
	}

	@Column(name = "title", length = 768)

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "creator", length = 768)

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Column(name = "isbn", length = 768)

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name = "issn", length = 768)

	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	@Column(name = "lang", length = 64)

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Column(name = "pub", length = 768)

	public String getPub() {
		return this.pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	@Column(name = "pubdate", length = 384)

	public String getPubdate() {
		return this.pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	@Column(name = "granule1", length = 72)

	public String getGranule1() {
		return this.granule1;
	}

	public void setGranule1(String granule1) {
		this.granule1 = granule1;
	}

	@Column(name = "granule2", length = 72)

	public String getGranule2() {
		return this.granule2;
	}

	public void setGranule2(String granule2) {
		this.granule2 = granule2;
	}

	@Column(name = "granule3", length = 72)

	public String getGranule3() {
		return this.granule3;
	}

	public void setGranule3(String granule3) {
		this.granule3 = granule3;
	}

	@Column(name = "granule1val", length = 1024)

	public String getGranule1val() {
		return this.granule1val;
	}

	public void setGranule1val(String granule1val) {
		this.granule1val = granule1val;
	}

	@Column(name = "granule2val", length = 1024)

	public String getGranule2val() {
		return this.granule2val;
	}

	public void setGranule2val(String granule2val) {
		this.granule2val = granule2val;
	}

	@Column(name = "granule3val", length = 1024)

	public String getGranule3val() {
		return this.granule3val;
	}

	public void setGranule3val(String granule3val) {
		this.granule3val = granule3val;
	}

	@Column(name = "objdesc", length = 4000)

	public String getObjdesc() {
		return this.objdesc;
	}

	public void setObjdesc(String objdesc) {
		this.objdesc = objdesc;
	}

	@Column(name = "objsource", length = 384)

	public String getObjsource() {
		return this.objsource;
	}

	public void setObjsource(String objsource) {
		this.objsource = objsource;
	}

	@Column(name = "assinfo", length = 384)

	public String getAssinfo() {
		return this.assinfo;
	}

	public void setAssinfo(String assinfo) {
		this.assinfo = assinfo;
	}

	@Column(name = "orgcd", nullable = false, length = 16)

	public String getOrgcd() {
		return this.orgcd;
	}

	public void setOrgcd(String orgcd) {
		this.orgcd = orgcd;
	}

	@Column(name = "errrowno")

	public Integer getErrrowno() {
		return this.errrowno;
	}

	public void setErrrowno(Integer errrowno) {
		this.errrowno = errrowno;
	}

	@Column(name = "errdesc", length = 96)

	public String getErrdesc() {
		return this.errdesc;
	}

	public void setErrdesc(String errdesc) {
		this.errdesc = errdesc;
	}

	@Column(name = "expndfield1", length = 384)

	public String getExpndfield1() {
		return this.expndfield1;
	}

	public void setExpndfield1(String expndfield1) {
		this.expndfield1 = expndfield1;
	}

	@Column(name = "expndfield2", length = 384)

	public String getExpndfield2() {
		return this.expndfield2;
	}

	public void setExpndfield2(String expndfield2) {
		this.expndfield2 = expndfield2;
	}

	@Column(name = "expndfield3", length = 384)

	public String getExpndfield3() {
		return this.expndfield3;
	}

	public void setExpndfield3(String expndfield3) {
		this.expndfield3 = expndfield3;
	}

	@Column(name = "expndfield4", length = 384)

	public String getExpndfield4() {
		return this.expndfield4;
	}

	public void setExpndfield4(String expndfield4) {
		this.expndfield4 = expndfield4;
	}

	@Column(name = "expndfield5", length = 384)

	public String getExpndfield5() {
		return this.expndfield5;
	}

	public void setExpndfield5(String expndfield5) {
		this.expndfield5 = expndfield5;
	}

	@Column(name = "expndfield6", length = 384)

	public String getExpndfield6() {
		return this.expndfield6;
	}

	public void setExpndfield6(String expndfield6) {
		this.expndfield6 = expndfield6;
	}

	@Column(name = "expndfield7", length = 384)

	public String getExpndfield7() {
		return this.expndfield7;
	}

	public void setExpndfield7(String expndfield7) {
		this.expndfield7 = expndfield7;
	}

	@Column(name = "expndfield8", length = 384)

	public String getExpndfield8() {
		return this.expndfield8;
	}

	public void setExpndfield8(String expndfield8) {
		this.expndfield8 = expndfield8;
	}

	@Column(name = "expndfield9", length = 384)

	public String getExpndfield9() {
		return this.expndfield9;
	}

	public void setExpndfield9(String expndfield9) {
		this.expndfield9 = expndfield9;
	}

	@Column(name = "expndfield10", length = 384)

	public String getExpndfield10() {
		return this.expndfield10;
	}

	public void setExpndfield10(String expndfield10) {
		this.expndfield10 = expndfield10;
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