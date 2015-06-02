package com.erestaurant.models;

/**
 *
 */
public class Drinks {

    private int IDd;
    private String denumire;
    private int pret;
    private int tip_alc;
    private int tip_hot;
    private String ingrediente;
    private int cantitate;

    public int getIDd(){
        return IDd;
    }
    public void setIDb(int IDd){
        this.IDd = IDd;
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

    public int getTipAlc(){
        return tip_alc;
    }
    public void setTipAlc(int tip_alc) {this.tip_alc = tip_alc;}

    public int getTipHot(){
        return tip_hot;
    }
    public void setTipHot(int tip_hot) {
        this.tip_hot = tip_hot;
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
