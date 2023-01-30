package com.rentacar.Dao;

import com.rentacar.Model.Employee;

public interface EmployeeDao {

    void createEmployeeAccount(Employee employee);

    Employee getEmployeeAccount(int id);

    void updateEmployeeAccount(int id);

    void deactivateEmployeeAccount(int id);
}
