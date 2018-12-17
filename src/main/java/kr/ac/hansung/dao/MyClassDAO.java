package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.MyClass;

@Repository
public class MyClassDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<MyClass> getMyclass() {
		String sqlStatement = "select year,semester,sum(credit) from class where not year=2019 group by year,semester";
		List<MyClass> myclass = jdbcTemplate.query(sqlStatement, new RowMapper<MyClass>() {
			@Override
			public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				MyClass myclass = new MyClass();
				myclass.setYear(rs.getInt("year"));
				myclass.setSemester(rs.getInt("semester"));
				myclass.setCredit(rs.getInt("sum(credit)"));
				return myclass;
			}
		});
		return myclass;
	}
	
	public List<MyClass> getMyclassd(int year, int semester) {
		String sqlStatement = "select * from class where year=? and semester=? ";
		List<MyClass> myclass = jdbcTemplate.query(sqlStatement, new Object[] { year, semester },
				new MyClassMapper());
		return myclass;
	}


	public boolean insert(MyClass myclass) {
		int year = 2019;
		int semester = 1; 
		String code = myclass.getCode();
		String name = myclass.getName();
		String course = myclass.getCourse();
		int credit = myclass.getCredit();

		String sqlStatement = "insert into class (year, semester, code, name, course, credit) values (?,?,?,?,?,?)";
		return (jdbcTemplate.update(sqlStatement,
				new Object[] { year, semester, code, name, course, credit }) == 1);
	}

	public boolean update(MyClass myclass) {
		int year = 2019; 
		int semester = 1; 
		String code = myclass.getCode();
		String name = myclass.getName();
		String course = myclass.getCourse();
		int credit = myclass.getCredit();
		int id = myclass.getId();

		String sqlStatement = "update class set year=?,semester=?, code=?, name=?, course=?, credit=? where id=?";
		return (jdbcTemplate.update(sqlStatement,
				new Object[] { year, semester, code, name, course, credit, id }) == 1);
	}

	public boolean delete(String code) {
		
		String sqlStatement = "delete from class where code=?";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] {code}) ==1);
	}

	public List<MyClass> getregisteredclass() {
		String sqlStatement = "select * from class where year=2019";
		
		return jdbcTemplate.query(sqlStatement, new MyClassMapper());
	}

}