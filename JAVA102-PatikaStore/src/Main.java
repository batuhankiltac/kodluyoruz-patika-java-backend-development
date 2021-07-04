import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Brand> brandList = new ArrayList<>();
        ArrayList<Product> noteBookList = new ArrayList<>();
        ArrayList<Product> smartPhoneList = new ArrayList<>();

        brandList.add(new Brand(brandList.size() + 1, "Samsung"));
        brandList.add(new Brand(brandList.size() + 1, "Lenovo"));
        brandList.add(new Brand(brandList.size() + 1, "Apple"));
        brandList.add(new Brand(brandList.size() + 1, "Huawei"));
        brandList.add(new Brand(brandList.size() + 1, "Casper"));
        brandList.add(new Brand(brandList.size() + 1, "Asus"));
        brandList.add(new Brand(brandList.size() + 1, "HP"));
        brandList.add(new Brand(brandList.size() + 1, "Xiaomi"));
        brandList.add(new Brand(brandList.size() + 1, "Monster"));

        noteBookList.add(new Notebook(noteBookList.size() + 1, 7499, "HUAWEI MateBook 14", brandList.get(3), 8, 256, 14.0));
        noteBookList.add(new Notebook(noteBookList.size() + 1, 5500, "LENOVO V14", brandList.get(1), 8, 1024, 14.0));
        noteBookList.add(new Notebook(noteBookList.size() + 1, 9283, "ASUS Tuf Gaming", brandList.get(5), 8, 512, 15.6));

        smartPhoneList.add(new SmartPhone(smartPhoneList.size() + 1, 8999, "SAMSUNG Galaxy Note20 Ultra", brandList.get(0), 256, 6.9, 108, 4500, 8, "Beyaz"));
        smartPhoneList.add(new SmartPhone(smartPhoneList.size() + 1, 9999, "APPLE iPhone 12", brandList.get(2), 64, 6.1, 12, 3046, 6, "Siyah"));
        smartPhoneList.add(new SmartPhone(smartPhoneList.size() + 1, 4199, "XIAOMI Mi Note 10", brandList.get(7), 64, 6.5, 64, 5260, 6, "Mor"));

        System.out.println("*** PatikaStore Teknoloji Mağazasına Hoşgeldiniz ***".toUpperCase());
        System.out.println("\nPatikaStore Ürün Yönetim Paneli !");

        int menuSelection = 1;
        while (menuSelection != 0) {
            menuSelection = printMenu();
            switch (menuSelection){
                case 0:
                    System.out.println("Çıkış işlemi başarılı.");
                    break;
                case 1:
                    printNotebooks(noteBookList);
                    break;
                case 2:
                    printMobile(smartPhoneList);
                    break;
                case 3:
                    printBrands(brandList);
                    break;
                default:
                    System.out.println("\nHatalı bir seçim yaptınız! Lütfen tekrar seçim yapınız.");
            }
        }
    }

    private static void printBrands(ArrayList<Brand> brandList) {
        brandList.sort(new BrandNameComparator());
        System.out.println("\nMarka Listesi\n------------------------------------------------");
        for(Brand brnd : brandList) {
            System.out.println("- " + brnd.name);
        }
        System.out.println("------------------------------------------------");
    }

    private static int printMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("1- Notebook Ürünleri");
        System.out.println("2- Smartphone Ürünleri");
        System.out.println("3- Marka Listeleme");
        System.out.println("0- Çıkış Yap");
        System.out.print("Seçiminiz: ");
        int selection = input.nextInt();
        return selection;
    }

    private static void printNotebooks(ArrayList<Product> noteBookList) {
        System.out.println("\nNotebook Listesi");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM    |");
        for(Product prd : noteBookList) {
            prd.print();
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    private static void printMobile(ArrayList<Product> smartPhoneList) {
        System.out.println("\nSmartphone Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
        for(Product prd : smartPhoneList) {
            prd.print();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
}