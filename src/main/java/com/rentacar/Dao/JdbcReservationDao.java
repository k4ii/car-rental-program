package com.rentacar.Dao;

import com.rentacar.Model.Reservation;
import org.springframework.stereotype.Component;

@Component
public class JdbcReservationDao implements ReservationDao{
    @Override
    public void createReservation(Reservation reservation) {

    }

    @Override
    public Reservation getReservation(int id) {
        return null;
    }

    @Override
    public void updateReservation(int id) {

    }

    @Override
    public void deleteReservation(int id) {

    }
}
