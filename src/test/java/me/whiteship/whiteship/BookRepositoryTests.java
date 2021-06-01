package me.whiteship.whiteship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryTests {

    @Test
    public void testAddAndFindById() {
        BookRepository repo = new BookRepository();
        Book book = new Book();
        book.setId(1);
        book.setTitle("whiteship");

        repo.add(book);
        assertEquals(book, repo.findById(1));
    }

}
