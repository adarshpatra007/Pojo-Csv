package com.training.pojo;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exceptionhandling {

	
		  public static void main(String[] args) {  
			  
			  Exceptionhandling eh1= new Exceptionhandling();
			   
			   eh1.getTotAmt();
			   eh1.getTotlines();
			   
			   String delimeter=",";
				String file = "src\\pojo.csv";
				  BufferedReader reader = null;
				  String line = "";
				  
				  
						  try {
						  double sum=0;
				   reader = new BufferedReader(new FileReader(file));
				   while((line = reader.readLine()) != null) {
				    
				    String[] row = line.split(delimeter);
				      
				    double value = Double.valueOf(line.split(",")[1]); //[1] - number after ','
		               sum+= value;
				  
				   for(String index : row) {
					     System.out.printf("%-10s", index);
					    }
					    System.out.println();
					      
					   
					   }
					  }
					  catch(Exception e) {
					   e.printStackTrace();
					      
					  }
				  
					  finally {
					   try {
					    reader.close();
					   } catch (IOException e) {
					    // TODO Auto-generated catch block
					    e.printStackTrace();
					   }
					  }
						  
						  if(totlines!=lineNum)
							  throw new ArithmeticException(" Value does not match ");
						   else
							   System.out.println(" values match");
									  
						  
			   if(sum!=totamt)
				   throw new ArithmeticException(" Value does not match ");
			   else
				   System.out.println(" values match");
						  

		  }

		private void getTotlines() {
			// TODO Auto-generated method stub
			
		}

		private void getTotAmt() {
			// TODO Auto-generated method stub
			
		}
}

	

