package com.rentacar.Dao;

import com.rentacar.Model.Employee;
import org.springframework.stereotype.Component;

@Component
public class JdbcEmployeeDao implements EmployeeDao{
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
