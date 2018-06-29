package pl.helion.jeeweb.notowaniagieldowe.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menedzer {
 
    private List<Spolka> spolki;
    private String symbolAktywnejSpolki;
    
    public Menedzer(){
        spolki=new ArrayList<>(3);
        Date d=new Date();
        spolki.add(new Spolka("Kocia Spółka Weglowa","KSW","energetyczny",20.0,11.0,d));
        spolki.add(new Spolka("KitKompDotCom", "KKDC", "informatyczny", 90.0, 3.4, d));
        spolki.add(new Spolka("Kocie Dance Studio", "KDS", "rozrywkowy", 15.0, -11.7, d));
        Date wczoraj=new Date(d.getTime()-86400000);
        spolki.get(0).getNotowania().add(0, new Notowanie(18, wczoraj, 4.0,spolki.get(0)));
        spolki.get(1).getNotowania().add(0, new Notowanie(87, wczoraj, -2.0,spolki.get(1)));
        spolki.get(2).getNotowania().add(0, new Notowanie(17, wczoraj, 10.0,spolki.get(2)));
    }
    public List<Spolka> getSpolki(){
        return spolki;
    }
    public void setSpolki(List<Spolka> spolki){
        this.spolki=spolki;
    }
    public Spolka getAktywnaSpolka(){
        for(Spolka s:this.getSpolki())
            if(s.getSymbol().equals(this.getSymbolAktywnejSpolki()))
                return s;
        return null;
                      
    }
    public String getSymbolAktywnejSpolki(){
        return symbolAktywnejSpolki;
    }
    public void setSymbolAktywnejSpolki(String symbolAktywnejSpolki){
        this.symbolAktywnejSpolki=symbolAktywnejSpolki;
    }
}
