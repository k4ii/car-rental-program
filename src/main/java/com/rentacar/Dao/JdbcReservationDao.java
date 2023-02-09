package com.rentacar.Dao;

import com.rentacar.Model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcReservationDao implements ReservationDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcReservationDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

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
