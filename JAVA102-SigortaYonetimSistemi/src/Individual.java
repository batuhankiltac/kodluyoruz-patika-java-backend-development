public class Individual extends Account {

    @Override
    public void addInsurance(Insurance insurance) {

    }

    @Override
    public int compareTo(Account o) {
        if (this.user.isim.compareTo(o.user.isim) < 0) {
            return -1;
        }
        else {
            return 1;
        }
    }
}