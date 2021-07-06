import java.util.*;

public class AddressManager {
    private final User user;

    public AddressManager(User user) {
        this.user = user;
    }

    public void addAddressToUser() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("""
                    Select the type of address do you want to add.
                    1- Home Address
                    2- Business Address""");
            switch (input.nextLine()) {
                case "1" -> {
                    System.out.print("Enter the id of the home address: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter the home address: ");
                    String addressHome = input.nextLine();

                    System.out.print("Enter the home address postcode: ");
                    int postCodeHome = input.nextInt();
                    input.nextLine();

                    user.getAddressList().add(new HomeAddress(id, addressHome, postCodeHome));
                }
                case "2" -> {
                    System.out.print("Enter the id of the business address: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter the business address: ");
                    String addressBusiness = input.nextLine();

                    System.out.print("Enter the business address postcode: ");
                    int postCodeBusiness = input.nextInt();
                    input.nextLine();

                    user.getAddressList().add(new BusinessAddress(id, addressBusiness, postCodeBusiness));
                }
            }
        }
        catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    public void deleteAddressFromUserByAddress() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the address do you want to delete: ");
            String addressInput = input.nextLine();
            user.getAddressList().removeIf(address -> address.getAddress().equalsIgnoreCase(addressInput));
        }
        catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    public void deleteAddressFromUserById() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the id do you want to delete: ");
            int idInput = input.nextInt();
            input.nextLine();
            user.getAddressList().removeIf(address -> address.getId() == idInput);
        }
        catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    public void deleteAddressFromUserByPostCode() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the post code do you want to delete: ");
            int postCodeInput = input.nextInt();
            input.nextLine();
            user.getAddressList().removeIf(address -> address.getPostCode() == postCodeInput);
        }
        catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}