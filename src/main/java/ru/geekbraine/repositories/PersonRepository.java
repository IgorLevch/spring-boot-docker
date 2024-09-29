package ru.geekbraine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbraine.entities.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
