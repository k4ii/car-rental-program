package com.rentacar.Dao;

import com.rentacar.Model.Customer;

public interface CustomerDao {

    void createCustomerAccount(Customer customer);

    Customer getCustomerAccount(int id);

    void updateCustomerAccount(int id);

    void deleteCustomerAccount(int id);
}
