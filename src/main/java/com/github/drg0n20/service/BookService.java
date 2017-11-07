package com.github.drg0n20.service;

import com.github.drg0n20.dto.BookDTO;
import com.github.drg0n20.dto.NewBookDTO;

import java.util.List;

public interface BookService {

    List<BookDTO> getBooks();

    BookDTO addBook(NewBookDTO newBookDTO);
}