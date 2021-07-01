// ** SUB CLASS-2 ** //

public class Memur extends Calisanlar{
    private String departman;
    private String mesaiSaati;

    public Memur(String adSoyad, String telefon, String eposta, String departman, String mesaiSaati) {
        super(adSoyad, telefon, eposta);
        this.departman = departman;
        this.mesaiSaati = mesaiSaati;
    }

    public String getDepartman() {
        return this.departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesaiSaati() {
        return this.mesaiSaati;
    }

    public void setMesaiSaati(String mesaiSaati) {
        this.mesaiSaati = mesaiSaati;
    }

    public void calis() {
        System.out.println(this.getAdSoyad() + " ön büroda mesaiye başladı.");
    }
}