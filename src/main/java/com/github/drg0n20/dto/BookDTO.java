package com.github.drg0n20.dto;

public class BookDTO {

    private String title;
    private AuthorNoBooksDTO author;
    private String uuid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorNoBooksDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorNoBooksDTO author) {
        this.author = author;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
