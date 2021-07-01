public class Patika {

    public static void main(String[] args) {
        Calisanlar cls = new Calisanlar("Mehmet Zeki", "324234234", "mehmet@gmail.com");

        Akademisyen akd = new Akademisyen("Mahmut Hoca", "23423432", "mahmut@gmail.com", "CENG", "Prof.");
        Memur mem = new Memur("Ahmet Yıldız", "483957345", "ahmet@gmail.com", "Büro Elemanı", "08:30-17:30");

        OgretimGorevlisi ogrt = new OgretimGorevlisi("Ayşe Çalık", "3294234", "CENG", "Ögr.Gör.","ayse@gmail.com", "102");
        Asistan ast = new Asistan("Melih Aslan", "435345345", "melih@gmail.com", "CENG", "Ast.", "09:00");

        LabAsistani labAst = new LabAsistani("Canan Karataş", "345345", "canan@gmail.com", "CENG", "Lab.Ast.", "09:00");

        IslemBilgi blg = new IslemBilgi("Suat Hacı", "495345345", "suat@gmail.com", "Bilgi İşlem", "08:30-17:30", "Bilgi İşlem Elemanı");
        GuvenlikGorevlisi guv = new GuvenlikGorevlisi("Doğan Aslan", "25943593", "dogan@gmail.com", "Güvenlik Bölümü", "06:00-15:00", "Uluslararası Özel Güvenlik Sertifikası");


        cls.yemekhane();

        akd.derseGir();
        mem.giris();

        ogrt.sinavYap();
        ast.quizYap();

        labAst.lablaraGir();

        blg.netKurulum();
        guv.nobetSaati();
        System.out.println(guv.getAdSoyad() + " isimli güvenlik personelinin " + guv.getBelgeAdi() + " bulunmaktadır.");
    }
}
