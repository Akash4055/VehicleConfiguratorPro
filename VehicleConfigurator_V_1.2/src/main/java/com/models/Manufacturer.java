package com.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Manufacturer {
	private int mid;
	private String mname;
	private int sid;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@JoinColumn(name="sid",referencedColumnName="sid")
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}	
	
}
