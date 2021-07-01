public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return this.kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplanti() {
        System.out.println(this.getAdSoyad() + " isimli öğretim görevlisi saat 17:00'deki toplantıya katılacak");
    }

    public void sinavYap() {
        System.out.println(this.getAdSoyad() + " isimli öğretim görevlisi ayın 18'indeki derste sınav yapacaktır.");
    }
}