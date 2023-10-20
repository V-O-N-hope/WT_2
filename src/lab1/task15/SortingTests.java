package lab1.task15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortingTests {

    @Test
    public void testBookSorting() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book2", "Author2", 25, 2, "ISBN456"));
        books.add(new Book("Book1", "Author1", 20, 1, "ISBN123"));
        books.add(new Book("Book3", "Author3", 30, 3, "ISBN789"));

        // Sort the books based on isbn
        Collections.sort(books);

        // Check if the books are sorted in the correct order
        assertEquals("ISBN123", books.get(0).getIsbn());
        assertEquals("ISBN456", books.get(1).getIsbn());
        assertEquals("ISBN789", books.get(2).getIsbn());
    }

    @Test
    public void testBookSortingWithDuplicates() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book2", "Author2", 25, 2, "ISBN456"));
        books.add(new Book("Book1", "Author1", 20, 1, "ISBN123"));
        books.add(new Book("Book3", "Author3", 30, 3, "ISBN789"));
        books.add(new Book("Book4", "Author4", 35, 4, "ISBN123")); // Duplicates ISBN123

        // Sort the books based on isbn
        Collections.sort(books);

        // Check if the books are sorted in the correct order
        assertEquals("ISBN123", books.get(0).getIsbn());
        assertEquals("ISBN123", books.get(1).getIsbn());
        assertEquals("ISBN456", books.get(2).getIsbn());
        assertEquals("ISBN789", books.get(3).getIsbn());
    }
}
