package com.github.drg0n20.repositiories;

import com.github.drg0n20.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author findOneByUuid(String uuid);

}
