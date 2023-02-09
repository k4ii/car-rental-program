package com.rentacar.Dao;

import com.rentacar.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcCustomerDao implements CustomerDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcCustomerDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createCustomerAccount(Customer customer) {

    }

    @Override
    public Customer getCustomerAccount(int id) {
        return null;
    }

    @Override
    public void updateCustomerAccount(int id) {

    }

    @Override
    public void deleteCustomerAccount(int id) {

    }
}
