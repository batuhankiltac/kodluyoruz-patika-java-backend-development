import java.util.*;

public class MyList <Type> {
    private Type[] list;
    private int items;

    public MyList() {
        this.list = (Type[]) new Object[10];
        this.items = items;
    }

    public MyList(int capacity) {
        this.list = (Type[]) new Object[capacity];
    }

    public int size() {
        return this.items;
    }

    public int getCapacity() {
        return this.list.length;
    }

    public void add(Type data) {
        if (size() == getCapacity()) {
            this.list = Arrays.copyOf(this.list,this.getCapacity() * 2);
        }
        this.list[this.items] = data;
        this.items++;
    }

    public Type get(int index) {
        if (index >= 0 && index < this.items) {
            return this.list[index];
        }
        else {
            return null;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < this.items) {
            for (int i = index; i < this.items - 1; i++) {
                this.list[i] = this.list[i + 1];
            }
            this.items--;
        }
        else {
            System.out.println("null");
        }
    }

    public void set(int index, Type data) {
        this.list[index] = data;
    }

    public String toString() {
        String str = "[";
        for (int i = 0 ; i < this.items; i++) {
            str += this.list[i];
            if (i != this.items - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

    public int indexOf(Type data) {
        for (int i = 0; i < this.items; i++) {
            if (list[i].equals(data)) {
                return i;
            }
        }
        return - 1;
    }

    public int lastIndexOf(Type data) {
        for (int i = this.items - 1; i >= 0; i--) {
            if (list[i].equals(data)) {
                return i;
            }
        }
        return - 1;
    }

    public boolean isEmpty() {
        return this.items == 0;
    }

    public Type[] toArray() {
        Type[] array = (Type[]) new Object[this.items];
        for(int i = 0; i < this.items; i++) {
            array[i] = this.list[i];
        }
        return array;
    }

    public void clear() {
        this.items = 0;
    }

    public MyList<Type> subList(int start, int finish) {
        int items = finish - start + 1;
        MyList<Type> sublist = new MyList<>(items);
        for(int i = start; i <= finish; i++) {
            sublist.add(this.list[i]);
        }
        return sublist;
    }

    public boolean contains(Type data) {
        for(int i = 0; i < this.items; i++) {
            if (this.list[i].equals(data)) {
                return true;
            }
        }
        return false;
    }
}