package com.suppliments.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.suppliments.model.Suppliments;
import com.suppliments.util.DBQueries;


@Repository
public class SupplimentsRepositoryImpl implements ISupplimentsRepository{

	private JdbcTemplate jdbcTemplate;
	 @Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addSuppliments(Suppliments suppliments) {
		Object[] SupplimentsArray = { suppliments.getProductName(), suppliments.getProductId(), suppliments.getType(),
				suppliments.getPrice()};
		jdbcTemplate.update(com.suppliments.util.DBQueries.INSERTQUERY,SupplimentsArray);	
		
	}

	@Override
	public void updateSuppliments(int productId, double amount) {
		jdbcTemplate.update(DBQueries.UPDATEQUERY,productId,amount);
	}

	@Override
	public void deleteSuppliments(int productId) {
		jdbcTemplate.update(DBQueries.DELETEQUERY,productId);
	}

	@Override
	public List<Suppliments> findByAll() {
		return jdbcTemplate.query(DBQueries.SELECTQUERY,new SupplimentsMapper());
		
	}

	@Override
	public List<Suppliments> findByType(String type) {
		return jdbcTemplate.query(com.suppliments.util.DBQueries.SELECTBYTYPE,new RowMapper<Suppliments>(){
		@Override
		public Suppliments mapRow(ResultSet rs,int rowNum) throws SQLException{
			Suppliments suppliments=new Suppliments();
		suppliments.setPrice(rs.getDouble("price"));
	    suppliments.setProductName(rs.getString("product_name"));
	    suppliments.setProductId(rs.getInt("product_id"));
	    suppliments.setType(rs.getString("type"));
	    	return suppliments;	
	}
	},type);
	}

	@Override
	public List<Suppliments> findByProductId(int productId) {
		return jdbcTemplate.query(DBQueries.SELECTBYPRODUCTID,new RowMapper<Suppliments>(){
			@Override
			public Suppliments mapRow(ResultSet rs,int rowNum) throws SQLException{
		Suppliments suppliments=new Suppliments();
		suppliments.setPrice(rs.getDouble("price"));
	    suppliments.setProductName(rs.getString("product_name"));
	    suppliments.setProductId(rs.getInt("product_id"));
	    suppliments.setType(rs.getString("type"));
	    return suppliments;
	}
	},productId);
	}
}