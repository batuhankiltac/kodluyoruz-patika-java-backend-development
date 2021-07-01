public class IslemBilgi extends Memur{
    private String gorev;

    public IslemBilgi(String adSoyad, String telefon, String eposta, String departman, String mesaiSaati, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesaiSaati);
        this.gorev = gorev;
    }

    public String getGorev() {
        return this.gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void netKurulum() {
        System.out.println(this.getAdSoyad() + " isimli bilgi işlem çalışanı network kurulumunu gerçekleştirdi.");
    }
}