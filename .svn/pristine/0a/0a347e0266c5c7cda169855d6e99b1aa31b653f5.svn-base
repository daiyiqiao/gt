package com.gt.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TdictId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class TdictId implements java.io.Serializable {

	// Fields

	private String dictfield;
	private String dictcd;

	// Constructors

	/** default constructor */
	public TdictId() {
	}

	/** full constructor */
	public TdictId(String dictfield, String dictcd) {
		this.dictfield = dictfield;
		this.dictcd = dictcd;
	}

	// Property accessors

	@Column(name = "dictfield", nullable = false, length = 16)

	public String getDictfield() {
		return this.dictfield;
	}

	public void setDictfield(String dictfield) {
		this.dictfield = dictfield;
	}

	@Column(name = "dictcd", nullable = false, length = 8)

	public String getDictcd() {
		return this.dictcd;
	}

	public void setDictcd(String dictcd) {
		this.dictcd = dictcd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TdictId))
			return false;
		TdictId castOther = (TdictId) other;

		return ((this.getDictfield() == castOther.getDictfield()) || (this.getDictfield() != null
				&& castOther.getDictfield() != null && this.getDictfield().equals(castOther.getDictfield())))
				&& ((this.getDictcd() == castOther.getDictcd()) || (this.getDictcd() != null
						&& castOther.getDictcd() != null && this.getDictcd().equals(castOther.getDictcd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDictfield() == null ? 0 : this.getDictfield().hashCode());
		result = 37 * result + (getDictcd() == null ? 0 : this.getDictcd().hashCode());
		return result;
	}

}