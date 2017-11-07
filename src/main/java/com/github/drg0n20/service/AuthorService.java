package com.github.drg0n20.service;

import com.github.drg0n20.dto.AuthorNoBooksDTO;

import java.util.List;

public interface AuthorService{

    List<AuthorNoBooksDTO> findAllWithoutBooks();

    AuthorNoBooksDTO addAuthor(AuthorNoBooksDTO authorNoBooksDTO);

}