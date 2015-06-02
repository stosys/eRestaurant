package com.erestaurant.models;
import java.util.Date;

/**
 *
 */
public class Bill {

    private int IDb;
    Date data = new Date();
    private double totalplata;
    private int puncte;
    private double reducere;
    private boolean confirm;

    public int getIDb(){
        return IDb;
    }
    public void setIDb(int IDb){
        this.IDb = IDb;
    }

    public Date getData(){
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public int getPuncte(){
        return puncte;
    }
    public void setPuncte(int puncte) {
        this.puncte = puncte;
    }

    public double getReducere(){
        return reducere;
    }
    public void setReducere(double reducere) {
        this.reducere = reducere;
    }

    public boolean getConfirm(){
        return confirm;
    }
    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }
}
