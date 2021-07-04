public class SmartPhone extends Product {
    int memory;
    double screenSize;
    int batteryPower;
    int ram;
    int camera;
    String color;


    public SmartPhone(int id, double price, String name, Brand brand, int memory, double screenSize, int camera, int batteryPower, int ram, String color) {
        super(id, price, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
        this.camera=camera;
    }

    @Override
    public void print() {
        System.out.printf("| %d  | %-30s|%.1f     | %-10s|%7d    |  %6.1f   |%7d    |%7d    |%7d    |%-11s| \n",this.id,this.name,this.price,this.brand.name,this.memory,this.screenSize,this.camera,this.batteryPower,this.ram,this.color);
    }
}