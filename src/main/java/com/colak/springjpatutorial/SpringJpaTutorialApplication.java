package com.colak.springjpatutorial;

import com.colak.springjpatutorial.jpa.Person;
import com.colak.springjpatutorial.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringJpaTutorialApplication implements CommandLineRunner {

    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaTutorialApplication.class, args);
    }

    // Logs are
    // org.hibernate.SQL                        :
    //     select
    //         p1_0.id,
    //         p1_0.name
    //     from
    //         person p1_0
    //     where
    //         p1_0.id=?
    // org.hibernate.orm.jdbc.bind              : binding parameter (1:BIGINT) <- [1]

    //  org.hibernate.SQL                        :
    //     insert
    //     into
    //         person
    //         (name, id)
    //     values
    //         (?, ?)
    // org.hibernate.orm.jdbc.bind              : binding parameter (1:VARCHAR) <- [person-name]
    // org.hibernate.orm.jdbc.bind              : binding parameter (2:BIGINT) <- [1]
    @Override
    public void run(String... args) {
        Person person = new Person(1L, "person-name");

        Person savedPerson = personService.save(person);
        log.info("savedPerson : {}", savedPerson);
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
