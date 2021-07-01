public class LabAsistani extends Asistan{

    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir() {
        System.out.println(this.getAdSoyad() + " isimli lab asistanı bilgisayar laboratuvarında öğrencilerin sorularını bekliyor.");
    }

    public void derseGir() {
        System.out.println(this.getAdSoyad() + " isimli lab asistanı ayın 20'sindeki derse katılım sağlayacaktır.");
    }
}