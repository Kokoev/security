package com.memorynotfound;

/**
 * Created by sovarugby on 30.11.16.
 */

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String login, String password, Integer age, String gender, String school) {
        String SQL = "insert into lol (login, password, age, gender, school) values (?, ?, ?, ?, ?)";
        jdbcTemplateObject.update( SQL, login, password, age, gender, school);
    }

    public Student getStudent(Integer id) {
        String SQL = "select * from lol where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new StudentMapper());
        return student;
    }

    public List<Student> listStudents() {
        String SQL = "select * from lol";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }

    public boolean userCheck(String login, String password){
        String SQL = "select count(*) from lol where login=? AND password = ?";
        Integer count = jdbcTemplateObject.queryForObject(SQL, Integer.class, login, password);
        Boolean check = (count==1);
        return check;
    }

    public int findId(String login){
        String SQL = "select id from lol where login =?";
        int id = jdbcTemplateObject.queryForObject(SQL, new Object[]{login}, Integer.class);
        return id;
    }

    public void delete(Integer id){
        String SQL = "delete from lol where id = ?";
        jdbcTemplateObject.update(SQL, id);
        return;
    }


    public void update(Student student, int id){
        String SQL = "update lol set login = ?, password=?, age=?, gender=?, school=? where id = ?";
        jdbcTemplateObject.update(SQL, student.getLogin(), student.getPassword(), student.getAge(), student.getGender(), student.getSchool(),id);
//        System.out.println("Updated Record with ID = " + id );
        return;
    }

}
