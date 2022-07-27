package com.rodrigopeleias.bookstoremanager.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private String name;

    private Integer pages;

    private Integer chapter;

    private String isbn;

    private String publisherName;

    private AuthorDTO author;
}
