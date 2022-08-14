package org.example.shen.repo.custom;

import org.example.shen.model.Book;
import org.example.shen.repo.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements BookRepository {
    @Override
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "Some Book");
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
