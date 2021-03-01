package se.lexicon.Spring_boot.dao;

import se.lexicon.Spring_boot.entity.Person;

import java.util.List;

public interface PersonDao {

    Person create(Person person);

    Person findById(int personId);

    List<Person> findAll();

    List<Person> findByName(String name);

    void remove(int id);

    Person update(Person person);

    List<Person> save(List<Person> people);
}
