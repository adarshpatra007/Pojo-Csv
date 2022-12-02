package com.training.pojo;


/*import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;*/

public class Line {
	private int lineNum;
	private String refDocNum;
	private String city;
	private float amt;
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Line(int lineNum, String refDocNum, String city, float amt) {
		super();
		this.lineNum = lineNum;
		this.refDocNum = refDocNum;
		this.city = city;
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Line [lineNum=" + lineNum + ", refDocNum=" + refDocNum + ", city=" + city + ", amt=" + amt + "]";
	}
	public int getLineNum() {
		return lineNum;
	}
	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}
	public String getRefDocNum() {
		return refDocNum;
	}
	public void setRefDocNum(String refDocNum) {
		this.refDocNum = refDocNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	
	public static void main(String args[]) {
		Line l1=new Line();
		l1.setLineNum(6);
		l1.setAmt((float) 170.0);
		
		
	}
	
	}

	 
	
	
	    
	
    


