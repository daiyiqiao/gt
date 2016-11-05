package com.gt.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TcdoioprtlogId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class TcdoioprtlogId implements java.io.Serializable {

	// Fields

	private Integer sercd;
	private String optdate;

	// Constructors

	/** default constructor */
	public TcdoioprtlogId() {
	}

	/** full constructor */
	public TcdoioprtlogId(Integer sercd, String optdate) {
		this.sercd = sercd;
		this.optdate = optdate;
	}

	// Property accessors

	@Column(name = "sercd", nullable = false)

	public Integer getSercd() {
		return this.sercd;
	}

	public void setSercd(Integer sercd) {
		this.sercd = sercd;
	}

	@Column(name = "optdate", nullable = false, length = 8)

	public String getOptdate() {
		return this.optdate;
	}

	public void setOptdate(String optdate) {
		this.optdate = optdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TcdoioprtlogId))
			return false;
		TcdoioprtlogId castOther = (TcdoioprtlogId) other;

		return ((this.getSercd() == castOther.getSercd()) || (this.getSercd() != null && castOther.getSercd() != null
				&& this.getSercd().equals(castOther.getSercd())))
				&& ((this.getOptdate() == castOther.getOptdate()) || (this.getOptdate() != null
						&& castOther.getOptdate() != null && this.getOptdate().equals(castOther.getOptdate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSercd() == null ? 0 : this.getSercd().hashCode());
		result = 37 * result + (getOptdate() == null ? 0 : this.getOptdate().hashCode());
		return result;
	}

}