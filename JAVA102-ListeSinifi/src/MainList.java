public class MainList {

    public static void main(String[] args) {
        MyList<Integer>list = new MyList<>();
        System.out.println("Liste Durumu: " + (list.isEmpty() ? "Boş" : "Dolu"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("Liste Durumu: " + (list.isEmpty() ? "Boş" : "Dolu"));

        System.out.println("Indeks: " + list.indexOf(20));

        System.out.println("Indeks:" + list.indexOf(100));

        System.out.println("Indeks: " + list.lastIndexOf(20));

        Object[] dizi = list.toArray();
        System.out.println("Object dizisinin ilk elemanı: " + dizi[0]);

        MyList<Integer> altListem = list.subList(0, 3);
        System.out.println(altListem.toString());

        System.out.println("Listemde 20 değeri: " + list.contains(20));
        System.out.println("Listemde 120 değeri: " + list.contains(120));

        list.clear();
        System.out.println(list.toString());
    }
}