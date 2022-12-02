package com.training.pojo;



public class Header {
	private int totlines;
	private float totamt;
	private int minamt;
	private String currentdate;
	public Header() {
		
		// TODO Auto-generated constructor stub
	}
	public Header(int totlines, float totamt, int minamt, String currentdate) {
		super();
		this.totlines = totlines;
		this.totamt = totamt;
		this.minamt = minamt;
		this.currentdate = currentdate;
	}
	@Override
	public String toString() {
		return "Header [totlines=" + totlines + ", totamt=" + totamt + ", minamt=" + minamt + ", currentdate="
				+ currentdate + "]";
	}
	public int getTotlines() {
		return totlines;
	}
	public void setTotlines(int totlines) {
		this.totlines = totlines;
	}
	public float getTotamt() {
		return totamt;
	}
	public void setTotamt(float totamt) {
		this.totamt = totamt;
	}
	public int getMinamt() {
		return minamt;
	}
	public void setMinamt(int minamt) {
		this.minamt = minamt;
	}
	public String getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(String currentdate) {
		this.currentdate = currentdate;
	}
	
	public static void main(String args[]) {
		Header h1= new Header();
		h1.setTotamt(170);
		h1.setTotlines(6);
	}

}
