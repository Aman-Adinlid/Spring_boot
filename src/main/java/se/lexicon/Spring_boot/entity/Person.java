package se.lexicon.Spring_boot.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;
@Column(nullable = false,length = 200)
    private String name;
@Column(nullable = false,length = 100)
    private String email;
@Column(nullable = false)
    private LocalDate birthDate;
@Column(nullable = false,columnDefinition = "tinyint(1) default 1")
    private boolean status;
   private LocalDate registerDate;

    public Person() {
        registerDate = LocalDate.now();
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
}
