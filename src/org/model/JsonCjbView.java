package org.model;

/**
 * Cjb entity. @author MyEclipse Persistence Tools
 */

public class JsonCjbView implements java.io.Serializable {

	// Fields

	private String xh;
	private String kch;
	private String vkcm;
	private String vxm;
	private Integer cj;
	private Integer xf;
	
	public JsonCjbView(){};
	
	public JsonCjbView(String xh, String kch, String vkcm, String vxm,
			Integer cj, Integer xf) {
		super();
		this.xh = xh;
		this.kch = kch;
		this.vkcm = vkcm;
		this.vxm = vxm;
		this.cj = cj;
		this.xf = xf;
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