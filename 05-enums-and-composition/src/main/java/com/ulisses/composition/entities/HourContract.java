package com.ulisses.composition.entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePeHour;
    private Integer hours;

    public HourContract(Date date, Double valueHour, Integer hours) {
        this.date = date;
        this.valuePeHour = valueHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePeHour() {
        return valuePeHour;
    }

    public void setValuePeHour(Double valuePeHour) {
        this.valuePeHour = valuePeHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePeHour * hours;
    }

}
