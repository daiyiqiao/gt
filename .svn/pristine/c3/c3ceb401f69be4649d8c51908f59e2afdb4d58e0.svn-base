package com.gt.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TrghtId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class TrghtId implements java.io.Serializable {

	// Fields

	private Integer roleid;
	private String functncd;

	// Constructors

	/** default constructor */
	public TrghtId() {
	}

	/** full constructor */
	public TrghtId(Integer roleid, String functncd) {
		this.roleid = roleid;
		this.functncd = functncd;
	}

	// Property accessors

	@Column(name = "roleid", nullable = false)

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	@Column(name = "functncd", nullable = false, length = 4)

	public String getFunctncd() {
		return this.functncd;
	}

	public void setFunctncd(String functncd) {
		this.functncd = functncd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TrghtId))
			return false;
		TrghtId castOther = (TrghtId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this.getRoleid() != null
				&& castOther.getRoleid() != null && this.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getFunctncd() == castOther.getFunctncd()) || (this.getFunctncd() != null
						&& castOther.getFunctncd() != null && this.getFunctncd().equals(castOther.getFunctncd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37 * result + (getFunctncd() == null ? 0 : this.getFunctncd().hashCode());
		return result;
	}

}