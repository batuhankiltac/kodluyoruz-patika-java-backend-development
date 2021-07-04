public class Notebook extends Product {
    int ram;
    int storage;
    double screenSize;

    public Notebook(int id, double price, String name, Brand brand, int ram, int storage, double screenSize) {
        super(id, price, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public void print(){
        System.out.printf("|%2d  | %-30s| %.1f    | %-9s | %6d    | %7.1f   | %-6d |\n",this.id,this.name,this.price,this.brand.name,this.storage,this.screenSize,this.ram);
    }
}