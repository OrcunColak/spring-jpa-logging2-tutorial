package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
