package lab1.task15;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;
    public Book(){

    }

    public Book(String title, String author, int price, int edition, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    public void setEdition(int edition) {
        Book.edition = edition;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    @Override
    public int compareTo(Book o) {
        return this.isbn.compareTo(o.isbn);
    }
}
