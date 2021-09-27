package br.com.pietroniro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "insert into employee values(?, ?, ?)";
        int result = jdbcTemplate.update(sql, new Integer(1), "David", "Pietroniro");
        System.out.println("Number of records inserted are: " + result);
    }
}
