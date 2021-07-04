import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();

        String email;
        String sifre;

        System.out.print("Email giriniz : ");
        email = input.next();
        System.out.print("Şifre giriniz : ");
        sifre = input.next();

        try {
            accountManager.login(email,sifre);
        }
        catch (InvalidAuthenticationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}