package com.erestaurant.models;

/**
 *
 */
public class Order {

    private int IDo;
    private int pret;
    private String domiciliu;
    private int masa;
    private Menu[] order;
    private int[] cantitate;

    public Order(){}

    public int getIDo(){
        return IDo;
    }
    public void setIDb(int IDo){
        this.IDo = IDo;
    }

    public int getPret(){
        return pret;
    }
    public void setPret(int pret) {
        this.pret = pret;
    }

    public  String getDomiciliu(){
        return domiciliu;
    }
    public void setDomiciliu(String Domiciliu) {
        this.domiciliu = domiciliu;
    }

    public int getMasa(){
        return masa;
    }
    public void setMasa(int masa) {
        this.masa = masa;
    }

    public Menu[] getOrder(){
        return order;
    }
    public void setOrder(Menu[] order) {
        this.order = order;
    }

    public int[] getCantitate(){
        return cantitate;
    }
    public void setCantitate(int[] cantitate){
        this.cantitate = cantitate;
    }

}
