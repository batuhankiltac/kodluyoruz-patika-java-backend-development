import java.util.Date;

public class HealthInsurance extends Insurance {

    public HealthInsurance(String isim, Double ucret, Date baslangic, Date bitis) {
        super(isim, ucret, baslangic, bitis);
    }

    @Override
    public void calculate() {
    }
}