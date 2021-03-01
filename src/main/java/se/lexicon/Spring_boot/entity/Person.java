package se.lexicon.Spring_boot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Person {
@Id
    private int personId;
    private String name;
    private String email;
    private LocalDate birthDate;
    private boolean status;
    private LocalDate registerDate;

    public Person() {
    }
}
