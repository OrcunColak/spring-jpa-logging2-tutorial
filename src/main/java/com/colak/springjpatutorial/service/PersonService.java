package com.colak.springjpatutorial.service;


import com.colak.springjpatutorial.jpa.Person;
import com.colak.springjpatutorial.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    @Transactional
    public Person save(Person person) {
        return repository.save(person);
    }
}
