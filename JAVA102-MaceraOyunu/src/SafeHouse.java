public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\nGüvenli Evdesiniz, sağlık puanınız yenileniyor.");

        if (this.getPlayer().isFood() && this.getPlayer().isFirewood() && this.getPlayer().isWater()) {
            this.getPlayer().setWin(true);
            System.out.println("**** OYUNU BAŞARIYLA BİTİRDİNİZ TEBRİKLER ! ****");
            return true;
        }
        System.out.println("Canınız yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        return true;
    }
}