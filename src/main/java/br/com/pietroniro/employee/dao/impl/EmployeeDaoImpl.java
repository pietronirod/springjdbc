package br.com.pietroniro.employee.dao.impl;

import br.com.pietroniro.employee.dao.EmployeeDao;
import br.com.pietroniro.employee.dto.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Employee employee) {
        String sql = "insert into employee value(?,?,?)";
        return jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
