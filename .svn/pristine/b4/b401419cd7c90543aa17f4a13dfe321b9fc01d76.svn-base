package com.gt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ttmpmetacdoi entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ttmpmetacdoi", schema = "public")

public class Ttmpmetacdoi implements java.io.Serializable {

	// Fields

	private String cdoicd;

	// Constructors

	/** default constructor */
	public Ttmpmetacdoi() {
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "cdoicd", unique = true, nullable = false, length = 256)

	public String getCdoicd() {
		return this.cdoicd;
	}

	public void setCdoicd(String cdoicd) {
		this.cdoicd = cdoicd;
	}

}