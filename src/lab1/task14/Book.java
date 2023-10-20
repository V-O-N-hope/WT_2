package lab1.task14;

import java.util.Objects;

public class Book implements Cloneable{

    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(){

    }

    public Book(String title, String author, int price, int edition){
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

    public void setEdition(int edition) {
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
        lab1.task14.Book book = (lab1.task14.Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }


    @Override
    public Object clone() {
        try {
            Book clonedBook = (Book) super.clone();

            // For deep copying, create a new instance of edition and copy the value.
            clonedBook.setEdition(getEdition());

            return clonedBook;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("CloneNotSupportedException should not occur.");
        }
    }


}
