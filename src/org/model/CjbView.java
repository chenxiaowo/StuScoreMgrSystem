package org.model;

/**
 * Cjb entity. @author MyEclipse Persistence Tools
 */

public class CjbView implements java.io.Serializable {

	// Fields

	private CjbId id;
	private String vkcm;
	private String vxm;
	private Integer cj;
	private Integer xf;

	// Constructors

	/** default constructor */
	public CjbView() {
	}

	public CjbView(CjbId id, String vkcm, String vxm, Integer cj, Integer xf) {
		super();
		this.id = id;
		this.vkcm = vkcm;
		this.vxm = vxm;
		this.cj = cj;
		this.xf = xf;
	}

	public CjbId getId() {
		return id;
	}

	public void setId(CjbId id) {
		this.id = id;
	}

	public String getVkcm() {
		return vkcm;
	}

	public void setVkcm(String vkcm) {
		this.vkcm = vkcm;
	}

	public String getVxm() {
		return vxm;
	}

	public void setVxm(String vxm) {
		this.vxm = vxm;
	}

	public Integer getCj() {
		return cj;
	}

	public void setCj(Integer cj) {
		this.cj = cj;
	}

	public Integer getXf() {
		return xf;
	}

	public void setXf(Integer xf) {
		this.xf = xf;
	}

	
}