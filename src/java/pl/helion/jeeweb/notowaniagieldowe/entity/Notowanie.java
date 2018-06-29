package pl.helion.jeeweb.notowaniagieldowe.entity;

import java.util.Date;

public class Notowanie {
 
    private double cena;
    private double zmiana;
    private Date dzien;
    private Spolka spolka;
    
    public Notowanie(){}
    
    public Notowanie(double cena, Date dzien, double zmiana, Spolka spolka){
        this.cena=cena;
        this.zmiana=zmiana;
        this.dzien=dzien;
        this.spolka=spolka;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public Date getDzien() {
        return dzien;
    }
    public void setDzien(Date dzien) {
        this.dzien = dzien;
    }
    public double getZmiana() {
        return zmiana;
    }
    public void setZmiana(double zmiana) {
        this.zmiana = zmiana;
    }
    public Spolka getSpolka() {
        return spolka;
    }
    public void setSpolka(Spolka spolka) {
        this.spolka = spolka;
    }
}
