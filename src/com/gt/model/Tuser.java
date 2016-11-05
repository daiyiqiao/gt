package com.gt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

/**
 * Tuser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tuser", schema = "public")

public class Tuser implements java.io.Serializable {

	// Fields

	private Integer usrid;
	private Torg torg;
	private Trole role;
	//private Integer roleid;
	//private String orgcd;
	private String loginid;//用户名
	private String loginpwd;
	private String usrnm;//姓名
	private String jobpstn;//职务
	private String usremail;
	private String telno;//办公室电话
	private String mobile;//手机
	private String delflg;
	private String serflg;
	private String usrstate;
	private String regact;
	private Integer crtusrid;
	private Timestamp crttime;
	private Integer updtusrid;
	private Timestamp updttime;

	// Constructors

	/** default constructor */
	public Tuser() {
	}

	/** minimal constructor */
	public Tuser(Torg torg) {
		this.torg = torg;
	}

	/** full constructor */
	public Tuser(Torg torg, Trole role, String loginid, String loginpwd, String usrnm, String jobpstn,
			String usremail, String telno, String mobile, String delflg, String serflg, String usrstate, String regact,
			Integer crtusrid, Timestamp crttime, Integer updtusrid, Timestamp updttime) {
		this.torg = torg;
		this.role = role;
		this.loginid = loginid;
		this.loginpwd = loginpwd;
		this.usrnm = usrnm;
		this.jobpstn = jobpstn;
		this.usremail = usremail;
		this.telno = telno;
		this.mobile = mobile;
		this.delflg = delflg;
		this.serflg = serflg;
		this.usrstate = usrstate;
		this.regact = regact;
		this.crtusrid = crtusrid;
		this.crttime = crttime;
		this.updtusrid = updtusrid;
		this.updttime = updttime;
	}

	// Property accessors
	@Id
	//@GeneratedValue
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "usrid", unique = true, nullable = false)

	public Integer getUsrid() {
		return this.usrid;
	}

	public void setUsrid(Integer usrid) {
		this.usrid = usrid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "orgcd", nullable = false)

	public Torg getTorg() {
		return this.torg;
	}

	public void setTorg(Torg torg) {
		this.torg = torg;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roleid", nullable = false)
	public Trole getRole() {
		return role;
	}

	public void setRole(Trole role) {
		this.role = role;
	}

	@Column(name = "loginid", length = 32)

	public String getLoginid() {
		return this.loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	@Column(name = "loginpwd", length = 16)

	public String getLoginpwd() {
		return this.loginpwd;
	}

	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}

	@Column(name = "usrnm", length = 16)
	public String getUsrnm() {
		return this.usrnm;
	}
	public void setUsrnm(String usrnm) {
		this.usrnm = usrnm;
	}

	@Column(name = "jobpstn", length = 16)

	public String getJobpstn() {
		return this.jobpstn;
	}

	public void setJobpstn(String jobpstn) {
		this.jobpstn = jobpstn;
	}

	@Column(name = "usremail", length = 32)

	public String getUsremail() {
		return this.usremail;
	}

	public void setUsremail(String usremail) {
		this.usremail = usremail;
	}

	@Column(name = "telno", length = 16)

	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	@Column(name = "mobile", length = 16)

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	@Column(name = "usrstate", length = 1)

	public String getUsrstate() {
		return this.usrstate;
	}

	public void setUsrstate(String usrstate) {
		this.usrstate = usrstate;
	}

	@Column(name = "regact", length = 32)

	public String getRegact() {
		return this.regact;
	}

	public void setRegact(String regact) {
		this.regact = regact;
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