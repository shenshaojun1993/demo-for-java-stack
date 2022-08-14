package org.example.shen.repo;

import org.example.shen.model.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
