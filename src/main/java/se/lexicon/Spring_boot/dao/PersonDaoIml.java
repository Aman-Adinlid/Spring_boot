package se.lexicon.Spring_boot.dao;

import se.lexicon.Spring_boot.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PersonDaoIml implements PersonDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Person create(Person person) {
        entityManager.persist(person); // *****************notice that persist means create or save**************
        return person;
    }

    @Override
    public Person findById(int personId) {
        return entityManager.find(Person.class, personId);
    }

    @Override
    public List<Person> findAll() {
        Query query = entityManager.createQuery("Select p from Person p");
        List<Person> result = query.getResultList();
        return result;
    }

    @Override
    public List<Person> findByName(String name) {
        Query query = entityManager.createQuery("select p from Person p where p.Name = :name");
        query.setParameter("Name", name);
        List<Person> personList = query.getResultList();
        return personList;

    }

    @Override
    public void remove(int id) {
        Person person = findById(id);
        entityManager.remove(person);
    }

    @Override
    public Person update(Person person) {
        return entityManager.merge(person); // merge means update
    }

    @Override
    public List<Person> save(List<Person> people) {
        for (Person person : people) {
            create(person);
        }
        return people;
    }
}
