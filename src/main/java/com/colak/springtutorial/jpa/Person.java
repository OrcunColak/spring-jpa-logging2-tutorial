package com.colak.springtutorial.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "person")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person  {
    @Id
    private Long id;

    private String name;
}
