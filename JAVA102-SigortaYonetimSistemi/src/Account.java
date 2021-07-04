import java.util.*;

public abstract class Account implements Comparable<Account> {
    User user;
    ArrayList<Insurance> insuranceList = new ArrayList<>();
    AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;

    final void showUserInfo() {
        System.out.println("İsim: " + this.user.isim + " Soyisim: "+ this.user.soyisim + " Email: " + this.user.email +
                " Şifre: " + this.user.sifre + " Meslek: " + this.user.meslek + " Yaş: "+ this.user.yas);
    }

    public void login(String email,String password) throws InvalidAuthenticationException {
        if (email.equals(this.user.email) && password.equals(this.user.sifre)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
        }
        else {
            throw new InvalidAuthenticationException("Giriş Yapılamadı!");
        }
    }

    public void addAddress(IAddress address) {
        this.user.adresListesi.add(address);
    }
    public void removeAddress(IAddress address) {
        this.user.adresListesi.remove(address);
    }
    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public abstract void addInsurance (Insurance insurance);

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(this.user, account.user) && Objects.equals(insuranceList, account.insuranceList) && authenticationStatus == account.authenticationStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.user, insuranceList, authenticationStatus);
    }
}
