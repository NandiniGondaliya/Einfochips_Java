package com.einfochips.springdatajpa.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int mid;
	private String mname;
	private String mdirector;
	private String mlanguage;
	
	
	public Movie(int mid, String mname, String mdirector, String mlanguage) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mdirector = mdirector;
		this.mlanguage = mlanguage;
	}
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
	public String getMdirector() {
		return mdirector;
	}
	public void setMdirector(String mdirector) {
		this.mdirector = mdirector;
	}
	public String getMlanguage() {
		return mlanguage;
	}
	public void setMlanguage(String mlanguage) {
		this.mlanguage = mlanguage;
	}
	
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mdirector=" + mdirector + ", mlanguage=" + mlanguage + "]";
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
