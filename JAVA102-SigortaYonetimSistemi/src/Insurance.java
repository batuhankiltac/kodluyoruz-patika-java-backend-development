import java.util.*;

public abstract class Insurance {
    String isim;
    Double ucret;
    Date baslangic;
    Date bitis;

    public Insurance(String isim, Double ucret, Date baslangic, Date bitis) {
        this.isim = isim;
        this.ucret = ucret;
        this.baslangic = baslangic;
        this.bitis = bitis;
    }

    public abstract void calculate();
}