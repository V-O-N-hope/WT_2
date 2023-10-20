package lab1.task16;

import java.util.Objects;
import java.util.Comparator;

public class Book {

    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book() {

    }

    public Book(String title, String author, int price, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        setEdition(edition);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + title + "][" + author + "][" + price + "][" + edition + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    // Comparators for sorting
    public static Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
    public static Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
    public static Comparator<Book> priceComparator = Comparator.comparingInt(Book::getPrice);


    // Compound comparator for sorting by author, then title, and then price
    public static Comparator<Book> authorTitlePriceComparator = authorComparator
            .thenComparing(titleComparator)
            .thenComparing(priceComparator);
}
