public class ToolStore extends NormalLocation {

    public ToolStore(Player player) {
        super(player, "Eşya Mağazası");
    }

    @Override
    public boolean onLocation() {
        System.out.print("\nMağazaya hoşgeldiniz. Silah ve Zırh satın alabilirsiniz.");
        System.out.print("\n1- Silahlar\n2- Zırhlar\nSeçiminiz: ");
        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.print("Geçersiz bir seçim yaptınız. Tekrar giriniz: ");
            selectCase = input.nextInt();
        }
        switch (selectCase) {
            case 1:
                weapons();
                buyWeapon();
                break;
            case 2:
                armors();
                buyArmor();
                break;
            case 3:
                return true;
        }
        return true;
    }

    public void weapons() {
        System.out.println("\n** Silahlar **");
        for (Weapon wp : Weapon.weapons()) {
            System.out.println("ID: " + wp.getId() +
                    " Silah adı: " + wp.getName() +
                    " Hasar: " + wp.getDamage() +
                    " Fiyat: " + wp.getPrice());
        }
        System.out.println("0 ile çıkış yapabilirsiniz.");
    }

    public void buyWeapon() {
        System.out.print("Satın almak istediğiniz silah ID'sini giriniz: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz bir ID girdiniz. Tekrar giriş yapınız.");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.isGetWeaponByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println(selectedWeapon.getName() + " silahı için yeterli paranız bulunmamaktadır.");
                }
                else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    public void armors() {
        System.out.println("\n** Zırhlar **");
        for (Armor arm : Armor.armors()) {
            System.out.println("ID: " + arm.getId() +
                    " Zırh adı: " + arm.getName() +
                    " Koruma oranı: " + arm.getBlock() +
                    " Fiyat: " + arm.getPrice());
        }
        System.out.println("0 ile çıkış yapabilirsiniz.");
    }

    public void buyArmor() {
        System.out.print("Satın almak istediğiniz zırh ID'sini giriniz: ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.println("Geçersiz bir ID girdiniz. Tekrar giriş yapınız.");
            selectArmorID = input.nextInt();
        }

        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.isGetArmorByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println(selectedArmor.getName() + " zırhı için yeterli paranız bulunmamaktadır.");
                }
                else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}