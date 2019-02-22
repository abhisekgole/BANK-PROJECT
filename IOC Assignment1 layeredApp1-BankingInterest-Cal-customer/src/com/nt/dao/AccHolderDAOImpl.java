package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.AccHolderBO;

public class AccHolderDAOImpl implements AccHolderDAO {
	
	public static final String INSERT_ACCHOLDER_DETAILS="INSERT INTO BANK_CAL VALUES(?,?,?,?,?,?)";
	private DataSource ds;

	public AccHolderDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(AccHolderBO bo) throws Exception {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		//get pooled JDBC connection  object from JDBC connection pool
		con=ds.getConnection();
		//create JDBC PreparedStatement object
		ps=con.prepareStatement(INSERT_ACCHOLDER_DETAILS);
		
		//set value to query param
		ps.setLong(1,bo.getAccno());
		ps.setString(2,bo.getAccHolderName());
		ps.setString(3,bo.getcAdd());
		ps.setDouble(4,bo.getPrincipalAmt());
		ps.setDouble(5,bo.getSimpleInt());
		ps.setDouble(6,bo.getCompoundInt());
		
		//execute the query
		int count=ps.executeUpdate();
		ps.close();
		con.close();
		return count;
	}

}
