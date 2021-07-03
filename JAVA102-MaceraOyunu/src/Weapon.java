public class Weapon {
    private int id;
    private String name;
    private int damage;
    private int price;

    public Weapon(int id, String name, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon(1, "Taş", 2, 15);
        weaponList[1] = new Weapon(2, "Sopa", 3, 20);
        weaponList[2] = new Weapon(3, "Kılıç", 4, 25);
        return weaponList;
    }

    public static Weapon isGetWeaponByID(int id) {
        for (Weapon wp : Weapon.weapons()) {
            if (wp.getId() == id) {
                return wp;
            }
        }
        return null;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}