package com.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

@Entity
public class Feature {
	private int fid;
	private String fname; 
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getFid() {
		return fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
}
