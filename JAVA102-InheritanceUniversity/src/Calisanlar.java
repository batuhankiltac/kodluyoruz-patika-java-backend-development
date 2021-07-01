// *** SUPER CLASS *** //

public class Calisanlar {
    private String adSoyad;
    private String telefon;
    private String eposta;

    public Calisanlar(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return this.adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return this.eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyad + " okula giriş yaptı.");
    }

    public void cikis() {
        System.out.println(this.adSoyad + " okuldan çıkış yaptı.");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + " yemekhaneye giriş yaptı.");
    }
}