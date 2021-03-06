package or.bibin.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.bibin.bean.ProductDetails;

public class DbImplementation implements DpIntialiation {
	static Connection con;
	static ProductDetails pro=new ProductDetails();
	public static Connection execute()
	{
		try {
			Class.forName(DB_CLASSNAME);
	 con=DriverManager.getConnection(DB_URL, DB_NAME, DB_PASSWORD);
	
	
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	public static LinkedList<ProductDetails> check(String s,int n)
	
	{
		
		try
		{
			execute();
		PreparedStatement stm=con.prepareStatement("Select * from productdetails where pid=?");
		stm.setString(1, s);
		ResultSet rs=stm.executeQuery();
		while(rs.next())
		{
			pro.setId(rs.getString(1));
			pro.setName(rs.getString(2));
			pro.setPrice(rs.getDouble(3));
			pro.setDiscount(rs.getInt(5));
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		LinkedList<ProductDetails> list=new LinkedList<>();
		list.add(pro);
		return list;
		
	}
	 


}
