package me.whiteship.whiteship;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {

    Map<Integer, Book> data = new HashMap<>();

    public void add(Book book) {
        data.put(book.getId(), book);
    }

    public Book findById(Integer id) {
        return data.get(id);
    }

}
