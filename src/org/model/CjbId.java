package org.model;

/**
 * CjbId entity. @author MyEclipse Persistence Tools
 */

public class CjbId implements java.io.Serializable {

	// Fields

	private String xh;
	private String kch;

	// Constructors

	/** default constructor */
	public CjbId() {
	}

	public CjbId(String xh, String kch) {
		super();
		this.xh = xh;
		this.kch = kch;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getKch() {
		return kch;
	}

	public void setKch(String kch) {
		this.kch = kch;
	}

	
	
}