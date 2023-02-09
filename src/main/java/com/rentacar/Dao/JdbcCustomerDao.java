package com.rentacar.Dao;

import com.rentacar.Model.Customer;
import org.springframework.stereotype.Component;

@Component
public class JdbcCustomerDao implements CustomerDao{
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
