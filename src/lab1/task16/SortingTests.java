package lab1.task16;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortingTests {

    @Test
    public void testTitleSorting() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "Author1", 20, 1));
        books.add(new Book("B", "Author2", 25, 2));
        books.add(new Book("A", "Author3", 30, 3));

        // Sort the books by title
        Collections.sort(books, Book.titleComparator);

        // Check if the books are sorted in the correct order
        assertEquals("A", books.get(0).getTitle());
        assertEquals("B", books.get(1).getTitle());
        assertEquals("C", books.get(2).getTitle());
    }

    @Test
    public void testAuthorTitlePriceSorting() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "Author1", 20, 1));
        books.add(new Book("B", "Author1", 25, 2));
        books.add(new Book("A", "Author2", 30, 3));

        // Sort the books by author, then title, and then price
        Collections.sort(books, Book.authorTitlePriceComparator);

        // Check if the books are sorted in the correct order
        assertEquals("B", books.get(0).getTitle());
        assertEquals("C", books.get(1).getTitle());
        assertEquals("A", books.get(2).getTitle());
    }

}
