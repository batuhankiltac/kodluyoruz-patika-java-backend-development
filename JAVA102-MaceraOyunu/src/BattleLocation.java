import java.util.*;

public abstract class BattleLocation extends Location{
    private GameObstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLocation(Player player, String name, GameObstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacle();
        System.out.println("\nŞuan bulunduğunuz bölge " + this.getName());
        System.out.println("DİKKAT! Bu bölgede " + obsNumber + " tane " + this.getObstacle().getName() + " bulunuyor.");
        System.out.print("'S'avaş veya 'K'aç --->>> ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S") && combat(obsNumber)) {
            System.out.println(this.getObstacle().getName() + " canavarını yendiniz.");
            return true;
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println(this.getObstacle().getName() + " canavarı tarafından öldürüldünüz.");
            return false;
        }
        return true;
    }

    private void playerFirstHit() {
        System.out.println("Siz vurdunuz !");
        this.getObstacle().setHealth(this.getObstacle().getHealth()- this.getPlayer().getTotalDamage());
        afterHit();

        if(this.getObstacle().getHealth() > 0) {
            System.out.println();
            System.out.println("Canavar Size Vurdu !");
            int obstacleDamage = this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
            if(obstacleDamage < 0) {
                obstacleDamage = 0;
            }
            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
            afterHit();
        }
    }

    private void obstacleFirstHit() {
        System.out.println("Canavar Size Vurdu !");
        int obstacleDamage = this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();

        if(obstacleDamage < 0) {
            obstacleDamage = 0;
        }
        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
        afterHit();

        if (this.getPlayer().getHealth() > 0) {
            System.out.println("Siz vurdunuz !");
            this.getObstacle().setHealth(this.getObstacle().getHealth()- this.getPlayer().getTotalDamage());
            afterHit();
        }
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getDefaultHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("'V'ur veya 'K'aç --->>> ");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    Random random = new Random();
                    int whoFirst = random.nextInt(2);
                    if (whoFirst == 0) {
                        playerFirstHit();
                    }
                    else {
                        obstacleFirstHit();
                    }
                }
                else return false;
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Tebrikler! " + this.getObstacle().getName() + " canavarını yendiniz.");
                if (this.getObstacle().getId() !=4){
                    System.out.println(this.getObstacle().getAward() + " para kazandınız");
                }
                else {
                    snakeAwardSystem();
                }
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
            }
            else {
                return false;
            }
        }
        return true;
    }

    private void snakeAwardSystem(){
        Random random = new Random();
        int randomAwardChance = random.nextInt(100);
        if (randomAwardChance < 15) {
            int randomWeapon = random.nextInt(100);
            if (randomWeapon < 20) {
                System.out.println("Kılıç Kazandınız ! ");
                this.getPlayer().getInventory().setWeapon(Weapon.weapons()[2]);
            }
            else if (randomWeapon < 50) {
                System.out.println("Sopa Kazandınız ! ");
                this.getPlayer().getInventory().setWeapon(Weapon.weapons()[1]);
            }
            else {
                System.out.println("Taş Kazandınız ! ");
                this.getPlayer().getInventory().setWeapon(Weapon.weapons()[0]);
            }
        }
        else if (randomAwardChance < 30) {
            int randomArmor = random.nextInt(100);
            if (randomArmor < 20) {
                System.out.println("Ağır Zırh Kazandınız ! ");
                this.getPlayer().getInventory().setArmor(Armor.armors()[2]);
            }
            else if(randomArmor < 50){
                System.out.println("Orta Zırh Kazandınız ! ");
                this.getPlayer().getInventory().setArmor(Armor.armors()[1]);
            }
            else {
                System.out.println("Hafif Zırh Kazandınız ! ");
                this.getPlayer().getInventory().setArmor(Armor.armors()[0]);
            }
        }
        else if (randomAwardChance < 55){
            int randomMoney = random.nextInt(100);
            if (randomMoney < 20){
                System.out.println("10 Para Kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
            }
            else if(randomMoney < 50){
                System.out.println("5 Para Kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);

            }
            else {
                System.out.println("1 Para Kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
            }
        }
    }

    public void afterHit() {
        System.out.println("Canınız = " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " canı = " + this.getObstacle().getHealth());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("\nOyuncu Değerleri\n--------------------");
        System.out.println("Sağlık: " + this.getPlayer().getHealth());
        System.out.println("Silah: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para: " + this.getPlayer().getMoney());
    }

    public void obstacleStats(int i) {
        System.out.println("\n" + i + "." + this.getObstacle().getName() + " Değerleri\n--------------------");
        System.out.println("Sağlık: " + this.getObstacle().getHealth());
        System.out.println("Hasar: " + this.getObstacle().getDamage());
        System.out.println("Ödül: " + this.getObstacle().getAward());
    }

    public int randomObstacle() {
        Random random = new Random();
        return random.nextInt(this.getMaxObstacle()) + 1;
    }

    public GameObstacle getObstacle() {
        return this.obstacle;
    }

    public void setObstacle(GameObstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return this.award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return this.maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}