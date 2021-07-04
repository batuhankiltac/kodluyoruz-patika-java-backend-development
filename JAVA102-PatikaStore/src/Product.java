public class Product implements Comparable<Product> {

    int id;
    double price;
    double discount;
    int stock;
    String name;
    Brand brand;




    @Override
    public int compareTo(Product o) {
        if (this.id < o.id)
            return -1;
        else
            return 1;
    }

    public Product(int id, double price, String name, Brand brand) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.brand = brand;
    }

    public void print() {

    }
}