package com.challenge.literalura.repository;

import com.challenge.literalura.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitle(String title);

    // Maybe an Enum would be better
    // Optional<Book> findByLanguage(String language);
}
