package com.mendes.bookshelf.domain.book;

import com.mendes.bookshelf.domain.author.Author;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String isbn;
    private String language;
    private Integer releaseYear;
    private Integer numberOfPages;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
