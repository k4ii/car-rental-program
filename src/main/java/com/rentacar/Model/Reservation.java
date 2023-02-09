package com.rentacar.Model;

import java.math.BigDecimal;
import java.util.Date;

public class Reservation {
    private int id;
    private Date begin_date;
    private Date end_date;
    private BigDecimal invoice;
    private int car_id;

    public Reservation() {
    }

    public Reservation(Date begin_date, Date end_date, BigDecimal invoice, int car_id) {
        this.begin_date = begin_date;
        this.end_date = end_date;
        this.invoice = invoice;
        this.car_id = car_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public BigDecimal getInvoice() {
        return invoice;
    }

    public void setInvoice(BigDecimal invoice) {
        this.invoice = invoice;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

}
