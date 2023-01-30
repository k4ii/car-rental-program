package com.rentacar.Dao;

import com.rentacar.Model.Car;

public interface CarDao {

    void addCarInformation(Car car);

    Car getCarInformation(int id);

    void updateCarInformation(int id);

    void deleteCarInformation(int id);
}
