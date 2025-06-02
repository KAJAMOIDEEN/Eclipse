package com.jdbc.connection;

import java.sql.*;

public class connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/banking?useSSL=false","root","root");
		//Statement st = connect.createStatement();
		
		/*
		//------Insert------
		System.out.println("------JDBC Insert------");
		 int id = 9;
		 String name ="john";
		 String cvv = "999";
		 String exp = "788";
		 
		PreparedStatement pst = connect.prepareStatement("insert into customer(customerID,customerName,customerCvvNumber,customerExpiryNumber) values(?,?,?,?)");
		 pst.setLong(1,id);
         pst.setString(2,name);
         pst.setString(3,cvv);
         pst.setString(4,exp);
		  
	    int rowCount = pst.executeUpdate(); 
	    
	    if(rowCount>0) {
	    	System.out.println("Data Inserted...");
	    }
	    else {
	    	System.out.println("Failed to Insert...");
	    }
		
	    
		
		//-----update------
	    System.out.println("\n------JDBC Update------");
	    int uid = 9;
	    String ucvv ="456";
		PreparedStatement pstt = connect.prepareStatement("update customer set customerCvvNumber=? where customerID=?");
         pstt.setString(1,ucvv);
         pstt.setLong(2,uid);
		 int status = pstt.executeUpdate(); 
		    
		    if(status>0) {
		    	System.out.println("Data Updated...");
		    }
		    else {
		    	System.out.println("Failed to Updated...");
		    }
		    
		}
		 

		//-----Delete-----
		System.out.println("\n------JDBC Delete------");
		    int did = 99;
		PreparedStatement pst4 = connect.prepareStatement("delete from customer where customerID=?");
	       pst4.setLong(1,did);
		 
	     int res = pst4.executeUpdate(); 
			    
	        if(res>0) {
			    	System.out.println("Data Deleted...");
			    }
			else {
			    	System.out.println("Failed to Delete...");
			    }
		    */
		  //----Select------ 
	      System.out.println("\n------JDBC Select------");
	      PreparedStatement pst = connect.prepareStatement("select * from customer;");
		// ResultSet rs = st.executeQuery("select * from customer;");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)
				+" "+rs.getString(3)+" "+rs.getString(4));
			} 
		
		}
		catch(Exception e){
			System.out.println(e.toString());
		} 
		
}
}
		