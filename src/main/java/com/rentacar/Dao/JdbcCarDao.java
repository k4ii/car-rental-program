package com.rentacar.Dao;

import com.rentacar.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcCarDao implements CarDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcCarDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addCarInformation(Car car) {

    }

    @Override
    public Car getCarInformation(int id) {
        return null;
    }

    @Override
    public void updateCarInformation(int id) {

    }

    @Override
    public void deleteCarInformation(int id) {

    }
}
