import java.util.*;

public class AccountManager {
    TreeSet<Account> accounts = new TreeSet<>();

    public Account login(String email,String sifre) throws InvalidAuthenticationException {
        for (Account a : accounts) {
            if (a.user.email.equals(email) && a.user.sifre.equals(sifre)) {
                try {
                    a.login(email,sifre);
                }
                catch (Error e) {
                    System.out.println(e.getMessage());
                }
                return a;
            }
        }
        return null;
    }
}