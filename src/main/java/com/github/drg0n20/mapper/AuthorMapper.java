package com.github.drg0n20.mapper;

import com.github.drg0n20.dto.AuthorNoBooksDTO;
import com.github.drg0n20.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface AuthorMapper {

    AuthorNoBooksDTO toAuthorNoBooksDTO(Author author);
    List<AuthorNoBooksDTO> toAuthorNoBooksDTO (Collection<Author> author);
}