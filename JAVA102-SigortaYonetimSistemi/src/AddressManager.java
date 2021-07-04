public class AddressManager {

    public static User addAddress (User user, IAddress address) {
        user.adresListesi.add(address);
        return user;
    }

    public static User removeAddress (User user, IAddress address) {
        user.adresListesi.remove(address);
        return user;
    }
}