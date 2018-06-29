package pl.helion.jeeweb.notowaniagieldowe.entity;

import java.util.*;

public class SektorInfo {
    
    private Menedzer menedzer;
    private Map<String, Double> ceny;
    
    public Menedzer getMenedzer(){
        return menedzer;
    }
    public void setMenedzer(Menedzer menedzer){
        this.menedzer=menedzer;
    }
    public Map<String,Double> getCeny(){
        ceny=new HashMap<>();
        for(Spolka s:this.getMenedzer().getSpolki()){
            Double wartosc=ceny.get(s.getSektor());
            if(wartosc==null)
                wartosc=0.0;
            ceny.put(s.getSektor(), wartosc+s.getOstatnie().getCena());
        }
        return ceny;
    }
    public Object[] getSektory(){
        Map<String,Double> mapa=this.getCeny();
        return mapa.keySet().toArray();
    }
}
