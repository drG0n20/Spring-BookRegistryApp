package com.github.drg0n20.service.BookServiceImpl;

import com.github.drg0n20.dto.BookDTO;
import com.github.drg0n20.dto.NewBookDTO;
import com.github.drg0n20.mapper.BookMapper;
import com.github.drg0n20.model.Author;
import com.github.drg0n20.model.Book;
import com.github.drg0n20.repositiories.AuthorRepository;
import com.github.drg0n20.repositiories.BookRepository;
import com.github.drg0n20.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<BookDTO> getBooks() {
        return bookMapper.toBookDTO(bookRepository.findAll());
    }

    @Override
    public BookDTO addBook(NewBookDTO newBookDTO) {
        Author author = authorRepository.findOneByUuid(newBookDTO.getAuthorUuid());
        if (author == null) {
            throw new RuntimeException();
        }
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(newBookDTO.getTitle());
        book = bookRepository.save(book);
        return bookMapper.toBookDTO(book);
    }
}
