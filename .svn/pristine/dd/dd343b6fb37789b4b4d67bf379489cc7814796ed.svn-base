package com.gt.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TchkplanrsId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class TchkplanrsId implements java.io.Serializable {

	// Fields

	private Integer mdatacd;
	private Integer calno;

	// Constructors

	/** default constructor */
	public TchkplanrsId() {
	}

	/** full constructor */
	public TchkplanrsId(Integer mdatacd, Integer calno) {
		this.mdatacd = mdatacd;
		this.calno = calno;
	}

	// Property accessors

	@Column(name = "mdatacd", nullable = false)

	public Integer getMdatacd() {
		return this.mdatacd;
	}

	public void setMdatacd(Integer mdatacd) {
		this.mdatacd = mdatacd;
	}

	@Column(name = "calno", nullable = false)

	public Integer getCalno() {
		return this.calno;
	}

	public void setCalno(Integer calno) {
		this.calno = calno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TchkplanrsId))
			return false;
		TchkplanrsId castOther = (TchkplanrsId) other;

		return ((this.getMdatacd() == castOther.getMdatacd()) || (this.getMdatacd() != null
				&& castOther.getMdatacd() != null && this.getMdatacd().equals(castOther.getMdatacd())))
				&& ((this.getCalno() == castOther.getCalno()) || (this.getCalno() != null
						&& castOther.getCalno() != null && this.getCalno().equals(castOther.getCalno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMdatacd() == null ? 0 : this.getMdatacd().hashCode());
		result = 37 * result + (getCalno() == null ? 0 : this.getCalno().hashCode());
		return result;
	}

}