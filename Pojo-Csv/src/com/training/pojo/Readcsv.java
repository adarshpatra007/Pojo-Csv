package com.training.pojo;

	import java.io.*;
	import java.util.ArrayList;
	import java.util.List;
	public class Readcsv {

		public static List<Line> main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			String delimeter=",";
			String file = "src\\pojo.csv";
			  BufferedReader reader = null;
			  String line = "";
			  
			  List<Line> Linelist =new ArrayList<Line>();
					  try {
			   reader = new BufferedReader(new FileReader(file));
			   while((line = reader.readLine()) != null) {
			    
			    String[] row = line.split(delimeter);
			      Linelist.add(line.split(delimeter));
			    
			  
			   for(String index : row) {
				     System.out.printf("%-10s", index);
				    }
				    System.out.println();
				      
				    //Line user= new Line(Integer.getInteger(lineNum[0]),refDocNum[1],city[2],Float.getFloat(amt[3]));
				   }
				  }
				  catch(Exception e) {
				   e.printStackTrace();
				       return Linelist;
				  }
			  
				  finally {
				   try {
				    reader.close();
				   } catch (IOException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				   }
				  }
		}
		private static String [] a; {
			  
			  if(a[0].startsWith("HAUDIT")) {
				  
			  
				  System.out.println("matched");
			  }
				  else {
					     
				  }
				 }
			  
			  
		
				

	}

