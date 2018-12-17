package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.MyClass;

public class MyClassMapper implements RowMapper<MyClass>{

	public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			// TODO Auto-generated method stub
			
			MyClass myclass=new MyClass();

			myclass.setYear(rs.getInt("year"));
			myclass.setSemester(rs.getInt("semester"));
			myclass.setCode(rs.getString("code"));
			myclass.setName(rs.getString("name"));
			myclass.setCourse(rs.getString("course"));
			myclass.setCredit(rs.getInt("credit"));			
			
			return myclass;
	}
	

}