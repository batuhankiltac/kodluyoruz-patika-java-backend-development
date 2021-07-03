import java.util.*;

public class Player {
    private int damage;
    private int health;
    private int defaultHealth;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;
    private boolean isFood = false;
    private boolean isFirewood = false;
    private boolean isWater = false;
    private boolean isWin = false;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("\nOYUNDAKİ KARAKTERLER");
        for (GameChar gameChar : charList) {
            System.out.println("ID: " + gameChar.getId() +
                    " Karakter: " + gameChar.getName() +
                    " Hasar: " + gameChar.getDamage() +
                    " Bloklama oranı: " + gameChar.getBlock() +
                    " Sağlık: " + gameChar.getHealth() +
                    " Para: " + gameChar.getMoney());
        }
        System.out.print("\nLütfen bir karakter ID'si giriniz: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initChar(new Samurai());
                break;
            case 2:
                initChar(new Archer());
                break;
            case 3:
                initChar(new Knight());
                break;
            default:
                initChar(new Samurai());
        }
        System.out.println("Karakter: " + this.getCharName() +
                " Hasar: " + this.getDamage() +
                " Sağlık: " + this.getHealth() +
                " Para: " + this.getMoney());
    }

    public void initChar(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setDefaultHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void showInfo() {
        System.out.println("Silahınız: " + this.getInventory().getWeapon().getName() +
                ", Hasarınız: " + this.getTotalDamage() +
                ", Zırhınız: " + this.getInventory().getArmor().getName() +
                ", Bloklama: " + this.getInventory().getArmor().getBlock() +
                ", Sağlığınız: " + this.getHealth() +
                ", Paranız: " + this.getMoney());
    }

    public int getTotalDamage() {
        return this.damage + getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getDefaultHealth() {
        return this.defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return this.charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon() {
        return this.getInventory().getWeapon();
    }

    public boolean isFood() {
        return this.isFood;
    }

    public void setFood(boolean food) {
        this.isFood = food;
    }

    public boolean isFirewood() {
        return this.isFirewood;
    }

    public void setFirewood(boolean firewood) {
        this.isFirewood = firewood;
    }

    public boolean isWater() {
        return this.isWater;
    }

    public void setWater(boolean water) {
        this.isWater = water;
    }

    public boolean isWin() {
        return this.isWin;
    }

    public void setWin(boolean win) {
        this.isWin = win;
    }
}