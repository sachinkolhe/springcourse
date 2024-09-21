package com.newgen.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.newgen.config.SpringConfig;
import com.newgen.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Creating an application context
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
      
    	//get bean of jdbcTemplate
//    	JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
    	
//    	int id = 3;
//    	String name = "Balkrishna";
//    	double marks = 43.3d;
    	
    	//this is example of insert query
//    	String insertQuery = "insert into student values(?,?,?)";
//    	int updatedRows = jdbcTemplate.update(insertQuery, id, name, marks);
//    	System.out.println("Added Rows into database : " + updatedRows);
    	
    	
    	//this is example of update query
//    	String updateQuery = "update student set marks = ? where id = ?";
//    	int updatedRows = jdbcTemplate.update(updateQuery, marks, id);
//    	System.out.println("Updated Rows into database : " + updatedRows);
    	
    	
    	
//    	String deleteQuery = "delete from student where id = ?";
//    	int deletedRows = jdbcTemplate.update(deleteQuery, id);
//    	System.out.println("deleted Rows into database : " + deletedRows);
    	

    	
    	
    	//below example of NamedParameterJdbcTemplate
    	//creating bean of NamedParameterJdbcTemplate
    	NamedParameterJdbcTemplate jdbcTemplate = applicationContext.getBean(NamedParameterJdbcTemplate.class);
    	
//    	int id = 3;
//    	String name = "Jon";
//    	double marks = 12.2d;
//    	
//    	Map<String, Object> map = new HashMap();
//    	map.put("id", id);
//    	map.put("name", name);
//    	map.put("marks", marks);
    	
//    	String query = "insert into student values(:id,:name,:marks)";
//    	int updatedRows = jdbcTemplate.update(query, map);
//    	System.out.println(updatedRows);
    

    	//example to fetch for all student
//    	String selectQuery = "select * from student";
    	
//    	List<Student> studentList = jdbcTemplate.query(selectQuery, new RowMapper<Student>() {
//
//			public Student mapRow(ResultSet resultSet, int arg1) throws SQLException {
//				Student st = new Student();
//				st.setId(resultSet.getInt("id"));
//				st.setName(resultSet.getString("name"));
//				st.setMarks(resultSet.getDouble("marks"));
//				return st;
//			}
//		
//    	});
    	
//    	List<Student> studentList = jdbcTemplate.query(selectQuery, (resultSet, columnIndex) -> {
//    		Student st = new Student();
//			st.setId(resultSet.getInt("id"));
//			st.setName(resultSet.getString("name"));
//			st.setMarks(resultSet.getDouble("marks"));
//			return st;
//    	});
//    	
//    	System.out.println(studentList);
    	
    	
    	String selectQuery = "select * from student where id = :id";
    	Map<String, Object> paramMap = new HashMap();
    	paramMap.put("id", 1);
    	
    	Student student = jdbcTemplate.queryForObject(selectQuery, paramMap, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet resultSet, int arg1) throws SQLException {
	    		Student st = new Student();
				st.setId(resultSet.getInt("id"));
				st.setName(resultSet.getString("name"));
				st.setMarks(resultSet.getDouble("marks"));
				return st;
			}
		});
    	
    	System.out.println(student);
    	
    }
    

}
