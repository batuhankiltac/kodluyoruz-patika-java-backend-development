public class Brand implements Comparable<Brand> {
    int id;
    String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        if (this.name.compareTo(o.name) < 0) {
            return -1;
        }
        else {
            return 1;
        }
    }
}