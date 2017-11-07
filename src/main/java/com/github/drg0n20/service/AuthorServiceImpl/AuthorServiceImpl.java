package com.github.drg0n20.service.AuthorServiceImpl;
import com.github.drg0n20.dto.AuthorNoBooksDTO;
import com.github.drg0n20.mapper.AuthorMapper;
import com.github.drg0n20.model.Author;
import com.github.drg0n20.repositiories.AuthorRepository;
import com.github.drg0n20.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public List<AuthorNoBooksDTO> findAllWithoutBooks() {
        return authorMapper.toAuthorNoBooksDTO(authorRepository.findAll());
    }

    @Override
    public AuthorNoBooksDTO addAuthor(AuthorNoBooksDTO authorNoBooksDTO) {
        Author author = new Author();
        author.setFirstName(authorNoBooksDTO.getFirstName());
        author.setLastName(authorNoBooksDTO.getLastName());

        author =  authorRepository.save(author);

        return authorMapper.toAuthorNoBooksDTO(author);
    }
}
