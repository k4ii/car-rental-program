package com.rentacar.Dao;

import com.rentacar.Model.Reservation;

public interface ReservationDao {

    void createReservation(Reservation reservation);

    Reservation getReservation(int id);

    void updateReservation(int id);

    void deleteReservation(int id);
}
