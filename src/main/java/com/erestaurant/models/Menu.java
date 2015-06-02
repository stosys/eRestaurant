package com.erestaurant.models;

/**
 *
 */
public class Menu {
    private long IDm;
    private String denumire;
    private int pret;
    private String ingrediente;
    private int cantitate;
    private String tip;

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

    public long getIDm() {
        return IDm;
    }
    public void setIDm(long IDm) {
        this.IDm = IDm;
    }

    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
}
