package com.rentacar.Dao;

import com.rentacar.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcEmployeeDao implements EmployeeDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcEmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createEmployeeAccount(Employee employee) {

    }

    @Override
    public Employee getEmployeeAccount(int id) {
        return null;
    }

    @Override
    public void updateEmployeeAccount(int id) {

    }

    @Override
    public void deactivateEmployeeAccount(int id) {

    }
}
