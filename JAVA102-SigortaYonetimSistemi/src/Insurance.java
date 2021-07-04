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

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Double getUcret() {
        return this.ucret;
    }

    public void setUcret(Double ucret) {
        this.ucret = ucret;
    }

    public Date getBaslangic() {
        return this.baslangic;
    }

    public void setBaslangic(Date baslangic) {
        this.baslangic = baslangic;
    }

    public Date getBitis() {
        return this.bitis;
    }

    public void setBitis(Date bitis) {
        this.bitis = bitis;
    }

    public abstract void calculate();
}
