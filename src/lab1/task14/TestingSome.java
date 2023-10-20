package lab1.task14;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestingSome {

    @Test
    public void testBookEquality() {
        Book book1 = new Book("Book 1", "Author 1", 20, 1);
        Book book2 = new Book("Book 1", "Author 1", 20, 1);

        assertEquals(book1, book2);
    }

    @Test
    public void testClone() {
        Book originalBook = new Book("Original Book", "Original Author", 30, 2);

        Book clonedBook = (Book) originalBook.clone();

        assertEquals(originalBook, clonedBook);
        assertNotSame(originalBook, clonedBook);
    }

    @Test
    public void testSettersAndGetters() {
        Book book = new Book();

        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setPrice(15);
        book.setEdition(3);

        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals(15, book.getPrice());
        assertEquals(3, Book.getEdition());
    }
}
