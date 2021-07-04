import java.util.Date;

public class CarInsurance extends Insurance {

    public CarInsurance(String isim, Double ucret, Date baslangic, Date bitis) {
        super(isim, ucret, baslangic, bitis);
    }

    @Override
    public void calculate() {
    }
}