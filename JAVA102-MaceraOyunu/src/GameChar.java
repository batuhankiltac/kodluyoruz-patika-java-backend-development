public abstract class GameChar {
    private int id;
    private String name;
    private int damage;
    private int block;
    private int health;
    private int money;

    public GameChar(int id, String name, int damage, int block, int health, int money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.block = block;
        this.health = health;
        this.money = money;
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

    public int getBlock() {
        return this.block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}