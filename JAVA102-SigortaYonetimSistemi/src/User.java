import java.util.*;

public class User {
    String isim;
    String soyisim;
    String email;
    String sifre;
    String meslek;
    int yas;
    ArrayList<IAddress> adresListesi;
    Date sistemeSonGirisTarihi;

    public User(String isim, String soyisim, String email, String sifre, String meslek, int yas, ArrayList<IAddress> adresListesi, Date sistemeSonGirisTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.sifre = sifre;
        this.meslek = meslek;
        this.yas = yas;
        this.adresListesi = adresListesi;
        this.sistemeSonGirisTarihi = sistemeSonGirisTarihi;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return this.soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return this.sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getMeslek() {
        return this.meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getYas() {
        return this.yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public ArrayList<IAddress> getAdresListesi() {
        return this.adresListesi;
    }

    public void setAdresListesi(ArrayList<IAddress> adresListesi) {
        this.adresListesi = adresListesi;
    }

    public Date getSistemeSonGirisTarihi() {
        return this.sistemeSonGirisTarihi;
    }

    public void setSistemeSonGirisTarihi(Date sistemeSonGirisTarihi) {
        this.sistemeSonGirisTarihi = sistemeSonGirisTarihi;
    }
}
