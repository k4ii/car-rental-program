package com.rentacar.Dao;

import com.rentacar.Model.Car;
import org.springframework.stereotype.Component;

@Component
public class JdbcCarDao implements CarDao{
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
