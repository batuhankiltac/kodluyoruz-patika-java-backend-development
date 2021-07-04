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
}