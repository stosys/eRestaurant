package com.erestaurant.models;

/**
 *
 */
public class Food {

    private long IDf;
    private String denumire;
    private int pret;
    private int tip;
    private String ingrediente;
    private int cantitate;

    public long getIDf(){
        return IDf;
    }
    public void setIDf(long IDf){
        this.IDf = IDf;
    }

    public String getDenumire(){
        return denumire;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getPret(){
        return pret;
    }
    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getTip(){
        return tip;
    }
    public void setTip(int tip) {
        this.tip = tip;
    }

    public String getIngrediente(){
        return ingrediente;
    }
    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getCantitate(){
        return cantitate;
    }
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
