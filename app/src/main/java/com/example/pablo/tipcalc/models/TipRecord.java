package com.example.pablo.tipcalc.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pablo on 13/10/16.
 */

public class TipRecord {
    private double bill;
    private int tipPercentage;
    private Date timestamp;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double getTip() {
        return bill *(tipPercentage/100d);
    }

    public String getDateFormated() {
        //Formateo de la hora
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd, yyyy H:mm");
        return simpleDateFormat.format(timestamp);
    }
}
