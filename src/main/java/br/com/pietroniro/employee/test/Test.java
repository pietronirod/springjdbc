package br.com.pietroniro.employee.test;

import br.com.pietroniro.employee.dao.EmployeeDao;
import br.com.pietroniro.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
        Employee employee = new Employee();

        employee.setId(2);
        employee.setFirstName("John");
        employee.setLastName("Connor");

        System.out.println("Number of records inserted are: " + dao.create(employee));
    }
}
