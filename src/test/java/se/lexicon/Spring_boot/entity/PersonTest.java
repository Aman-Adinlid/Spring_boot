package se.lexicon.Spring_boot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.time.LocalDate;

public class PersonTest {
    Person person;
    LocalDate currentDateTime;

    @BeforeEach
    public void setUp() {
        currentDateTime = LocalDate.now();
        person = new Person(1, "Aman",
                "aman23@gmail.com", LocalDate.parse("2020-03-01"), false, currentDateTime);

    }

    @Test
    @DisplayName("Test1: test create method")
    public void test_successfully_created() {
        Assertions.assertEquals(1, person.getPersonId());
        Assertions.assertEquals("Aman", person.getName());
        Assertions.assertEquals("aman23@gmail.com", person.getEmail());


    }

    @Test
    @DisplayName("Test2: test equal method")
    public void test_equals() {
        Person expected = new Person(1,
                "Aman",
                "aman23@gmail.com",
                LocalDate.parse("2020-03-01"),
                false,
                currentDateTime);
        Person actual = person;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test3: test hashCode method")
    public void test_hashCode() {
        Person expected = new Person(1,
                "Aman",
                "aman23@gmail.com",
                LocalDate.parse("2020-03-01"),
                false,
                currentDateTime);
        Person actual = person;
        Assertions.assertEquals(expected, actual);
    }
}
