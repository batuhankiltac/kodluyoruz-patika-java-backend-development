import java.util.*;

public class AccountManager {
    TreeSet<Account> accounts = new TreeSet<>();

    public Account login(String email, String sifre) throws InvalidAuthenticationException {
        for (Account account : accounts) {
            if (account.user.email.equals(email) && account.user.sifre.equals(sifre)) {
                try {
                    account.login(email, sifre);
                }
                catch (Error e) {
                    System.out.println(e.getMessage());
                }
                return account;
            }
        }
        return null;
    }
}
