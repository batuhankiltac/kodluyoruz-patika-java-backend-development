public class GuvenlikGorevlisi extends Memur{
    private String belgeAdi;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesaiSaati, String belgeAdi) {
        super(adSoyad, telefon, eposta, departman, mesaiSaati);
        this.belgeAdi = belgeAdi;
    }

    public String getBelgeAdi() {
        return this.belgeAdi;
    }

    public void setBelgeAdi(String belgeAdi) {
        this.belgeAdi = belgeAdi;
    }

    public void nobetSaati() {
        System.out.println(this.getAdSoyad() + " isimli güvenlik görevlisi bugün nöbetine gecikti.");
    }
}