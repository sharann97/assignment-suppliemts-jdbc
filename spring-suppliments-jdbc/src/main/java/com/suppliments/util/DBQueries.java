package com.suppliments.util;

public class DBQueries {
	public static final String INSERTQUERY=
			"INSERT INTO SUPPLIMENTS(product_name,product_id,type,price) values(?,?,?,?)";
		public static final String UPDATEQUERY="UPDATE SUPPLIMENTS SET amount=? where product_id=?";
		public static final String DELETEQUERY="DELETE FROM INVESTMENT WHERE product_id=?";
		
		public static final String SELECTQUERY="SELECT * FROM SUPPLIMENTS";
		public static final String SELECTBYTYPE="SELECT * FROM SUPPLIMENTS WHERE TYPE=?";
		public static final String SELECTBYPRODUCTID="SELECT * FROM SUPPLIMENTS WHERE PRODUCTID=?";
		public static final String SELECTBYPRICE="SELECT * FROM INVESTMENT WHERE PRICE=? AND PRODUCTID<?";
		public static final String SELECTBYPRODUCTNAME="SELECT * FROM SUPPLIMENTS WHERE PRODUCTNAME=?";
	
}
