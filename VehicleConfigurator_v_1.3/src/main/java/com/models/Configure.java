package com.models;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Configure {
	private int cid,vid;
	private Feature featureDetails;
	private String ctype;
	private int isconfigurable;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@JoinColumn(name="vid",referencedColumnName="vid")
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getCtype() {
		return ctype;
	}
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public Feature getFeatureDetails() {
		return featureDetails;
	}
	public void setFeatureDetails(Feature featureDetails) {
		this.featureDetails = featureDetails;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public int getIsconfigurable() {
		return isconfigurable;
	}
	public void setIsconfigurable(int isconfigurable) {
		this.isconfigurable = isconfigurable;
	}
}
