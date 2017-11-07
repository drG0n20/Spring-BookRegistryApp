package com.github.drg0n20.mapper;

import com.github.drg0n20.dto.BookDTO;

import com.github.drg0n20.model.Book;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring", uses = {AuthorMapper.class}, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface BookMapper {

    BookDTO toBookDTO(Book book);
    List<BookDTO> toBookDTO(Collection<Book> books);
}