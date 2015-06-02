package com.erestaurant.models;

/**
 *
 */
public class User {

    private long IDu;
    private int tip;
    private String nrtelefon;
    private String email;

    public User(){}

    public long getIDu(){
        return IDu;
    }
    public void setIDu(long IDu){
        this.IDu = IDu;
    }

    public int getTip(){
        return tip;
    }
    public void setTip(int tip){
        this.tip = tip;
    }

    public String getNrtelefon(){
        return nrtelefon;
    }
    public void setNrtelefon(String nrtelefon){
        this.nrtelefon = nrtelefon;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
