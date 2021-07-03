import java.util.*;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("\n**** PATİKA MACERA OYUNUNA HOŞGELDİNİZ ****");
        System.out.print("Lütfen adınızı giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Merhaba " + playerName.toUpperCase());
        player.selectChar();
        Location location = null;
        while (true) {
            player.showInfo();
            System.out.print("\nOYUNDAKİ BÖLGELER" +
                    "\n1- Güvenli Ev" +
                    "\n2- Eşya Mağazası" +
                    "\n3- Mağaraya git" +
                    "\n4- Ormana git" +
                    "\n5- Nehire git" +
                    "\n6- Madene git" +
                    "\nLütfen bir bölge seçiniz: ");
            int selectLocation = input.nextInt();
            switch (selectLocation) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (location == null) {
                System.out.println("Oyun sona erdi. Hoşçakal.");
                break;
            }
            if (!location.onLocation()) {
                System.out.print("OYUN SONA ERDİ.");
                break;
            }
        }
    }
}