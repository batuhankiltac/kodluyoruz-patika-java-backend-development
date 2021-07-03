public class Armor {
    private int id;
    private String name;
    private int block;
    private int price;

    public Armor(int id, String name, int block, int price) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1, "Hafif", 2, 15);
        armorList[1] = new Armor(2, "Orta", 4, 20);
        armorList[2] = new Armor(3, "Ağır", 6, 25);
        return armorList;
    }

    public static Armor isGetArmorByID(int id) {
        for (Armor arm : Armor.armors()) {
            if (arm.getId() == id) {
                return arm;
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

    public int getBlock() {
        return this.block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}