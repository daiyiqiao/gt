package com.gt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tjob entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tjob", schema = "public")

public class Tjob implements java.io.Serializable {

	// Fields

	private Integer jobid;
	private Integer sercd;
	private String path;
	private String tablename;
	private String uploaddate;
	private String isrun;
	private String jobtype;
	private String jobcontent;
	private String endtime;

	// Constructors

	/** default constructor */
	public Tjob() {
	}

	/** full constructor */
	public Tjob(Integer sercd, String path, String tablename, String uploaddate, String isrun, String jobtype,
			String jobcontent, String endtime) {
		this.sercd = sercd;
		this.path = path;
		this.tablename = tablename;
		this.uploaddate = uploaddate;
		this.isrun = isrun;
		this.jobtype = jobtype;
		this.jobcontent = jobcontent;
		this.endtime = endtime;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "jobid", unique = true, nullable = false)

	public Integer getJobid() {
		return this.jobid;
	}

	public void setJobid(Integer jobid) {
		this.jobid = jobid;
	}

	@Column(name = "sercd")

	public Integer getSercd() {
		return this.sercd;
	}

	public void setSercd(Integer sercd) {
		this.sercd = sercd;
	}

	@Column(name = "path", length = 60)

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "tablename", length = 32)

	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	@Column(name = "uploaddate", length = 8)

	public String getUploaddate() {
		return this.uploaddate;
	}

	public void setUploaddate(String uploaddate) {
		this.uploaddate = uploaddate;
	}

	@Column(name = "isrun", length = 1)

	public String getIsrun() {
		return this.isrun;
	}

	public void setIsrun(String isrun) {
		this.isrun = isrun;
	}

	@Column(name = "jobtype", length = 8)

	public String getJobtype() {
		return this.jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	@Column(name = "jobcontent", length = 8)

	public String getJobcontent() {
		return this.jobcontent;
	}

	public void setJobcontent(String jobcontent) {
		this.jobcontent = jobcontent;
	}

	@Column(name = "endtime", length = 8)

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

}