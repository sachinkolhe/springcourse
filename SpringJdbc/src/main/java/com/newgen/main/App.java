package com.newgen.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.newgen.config.SpringConfig;

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
    	JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
    	
    	int id = 3;
    	String name = "Balkrishna";
    	double marks = 12.2d;
    	
    	
    	String insertQuery = "insert into student values(?,?,?)";
    	
    	String updateQuery = "update student set marks = 40 where id = 1";
    	
    	String deleteQuery = "delete from student where id = 3";
    	
    	
    	int updatedRows = jdbcTemplate.update(insertQuery, id, name, marks);
    	
    	System.out.println("Updated/Added Rows into database : " + updatedRows);
    	
    	
//    	NamedParameterJdbcTemplate jdbcTemplate = applicationContext.getBean(NamedParameterJdbcTemplate.class);
//    	
//    	int id = 2;
//    	String name = "Jon";
//    	double marks = 12.2d;
//    	
//    	Map<String, Object> map = new HashMap();
//    	map.put("id", id);
//    	map.put("name", name);
//    	map.put("marks", marks);
//    	
//    	String query = "insert into student values(:id,:name,:marks)";
//    	int updatedRows = jdbcTemplate.update(query, map);
//    	System.out.println(updatedRows);
    
    }
    
//    public Stude findUserById(int id) {
//        String sql = "SELECT * FROM student WHERE id = :id";
//        Map<String, Object> params = new HashMap<>();
//        params.put("id", id);
//        
//        return namedParameterJdbcTemplate.queryForObject(sql, params, new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                User user = new User();
//                user.setId(rs.getInt("id"));
//                user.setUsername(rs.getString("username"));
//                return user;
//            }
//        });
//    }
}
