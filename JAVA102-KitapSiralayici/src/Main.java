import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet<>();

        treeSet.add(new Book("Speechless: Controlling Words, Controlling Minds","Michael Knowles",256,"2021"));
        treeSet.add(new Book("Once Upon a Time in Hollywood","Quentin Tarantino",400,"2021"));
        treeSet.add(new Book("American Marxism","Mark R. Levin",320,"2021"));
        treeSet.add(new Book("Falling","T. J. Newman",304,"2021"));
        treeSet.add(new Book("The Last Thing He Told Me","Laura Dave",321,"2021"));

        System.out.println("\n** Kitap ismine göre sıralama **".toUpperCase());
        for (Book book : treeSet) {
            book.showBook();
        }

        TreeSet<Book> pagesSet = new TreeSet<>(new OrderBookPagesComparator());

        pagesSet.addAll(treeSet);
        System.out.println("\n** Sayfa sayısına göre Sıralama **".toUpperCase());
        for (Book book : pagesSet) {
            book.showBook();
        }
    }
}