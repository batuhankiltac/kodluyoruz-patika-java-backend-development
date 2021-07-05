import java.time.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> bookPageNumber = new ArrayList<>();
        HashMap<String,String> bookAuthorName = new HashMap<>();

        bookList.add(new Book("kitap1",150,"yazar1",LocalDate.parse("2001-01-01")));
        bookList.add(new Book("kitap2",240,"yazar2",LocalDate.parse("2002-02-02")));
        bookList.add(new Book("kitap3",50,"yazar3",LocalDate.parse("2003-03-03")));
        bookList.add(new Book("kitap4",420,"yazar4",LocalDate.parse("2004-04-04")));
        bookList.add(new Book("kitap5",65,"yazar5",LocalDate.parse("2005-05-05")));
        bookList.add(new Book("kitap6",120,"yazar6",LocalDate.parse("2006-06-06")));
        bookList.add(new Book("kitap7",350,"yazar7",LocalDate.parse("2007-07-07")));
        bookList.add(new Book("kitap8",90,"yazar8",LocalDate.parse("2008-08-08")));
        bookList.add(new Book("kitap9",100,"yazar9",LocalDate.parse("2009-09-09")));
        bookList.add(new Book("kitap10",70,"yazar10",LocalDate.parse("2010-10-10")));

        bookList.forEach(book -> {
            bookAuthorName.put(book.getName(),book.getAuthorName());
        });
        System.out.println("** KİTAP LİSTESİ **\n-----------------------------------------");
        for(String i : bookAuthorName.keySet()) {
            System.out.println("KİTAP ADI: " + i + " -->> " + " YAZAR ADI: " + bookAuthorName.get(i));
        }

        bookList.stream().filter(book -> book.getPageNumber() >= 100).forEach(book -> bookPageNumber.add(book));
        System.out.println("\n** SAYFA SAYISI 100 VE ÜZERİ OLAN KİTAPLAR **\n-----------------------------------------");
        for(Book i : bookPageNumber) {
            System.out.println("KİTAP ADI: " + i.getName() + " SAYFA SAYISI: " + i.getPageNumber() );
        }
    }
}