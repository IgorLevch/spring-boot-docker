package ru.geekbraine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbraine.entities.Person;
import ru.geekbraine.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final PersonRepository personRepository;

    public List<Person> finAll(){

        return personRepository.findAll();
    }

    public Optional<Person>  findById(Long id){
        return personRepository.findById(id);

    }


    public void delete(Long id){
        personRepository.deleteById(id);

    }

    public void deleteAll(){
        personRepository.deleteAll();
    }

    public Person createNewPerson(Person person){

        Person p = new Person();
        p.setId(person.getId());
        p.setName(person.getName());
        p.setAge(person.getAge());
        p.setEmail(person.getEmail());

        personRepository.save(p);
        return p;

    }


}
