package com.challenge.literalura.repository;

import com.challenge.literalura.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findAliveAuthorByYear(String year);
}
