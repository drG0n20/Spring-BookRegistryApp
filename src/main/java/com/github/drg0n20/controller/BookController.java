package com.github.drg0n20.controller;


import com.github.drg0n20.dto.BookDTO;
import com.github.drg0n20.dto.NewBookDTO;
import com.github.drg0n20.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDTO> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    BookDTO addBook(@RequestBody NewBookDTO newBookDTO){
        return bookService.getBooks();
    }
}
