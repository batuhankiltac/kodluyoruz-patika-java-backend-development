import java.util.*;

public class Book implements Comparable<Book> {
    String bookName;
    String authorName;
    int pages;
    String releaseDate;

    @Override
    public int compareTo(Book o) {
        if (this.bookName.compareTo(o.bookName) < 0) {
            return -1;
        }
        else {
            return 1;
        }
    }

    public Book(String bookName, String authorName, int pages, String releaseDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pages = pages;
        this.releaseDate = releaseDate;
    }

    public void showBook() {
        System.out.println("(1)-KİTAP ADI: " + this.bookName + " (2)-YAZAR ADI: " + this.authorName + " (3)-SAYFA SAYISI: "+ this.pages + " (4)-YAYIN TARİHİ: " + this.releaseDate);
    }
}