package ru.geekbraine.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbraine.entities.Person;
import ru.geekbraine.services.PeopleService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/people")
@RequiredArgsConstructor
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping
    public List<Person> findAll(){

        return peopleService.finAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> findById(@PathVariable Long id){

        return peopleService.findById(id);
    }

    @DeleteMapping
    public void delete(){
        peopleService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        peopleService.delete(id);

    }
    @PostMapping
    public Person createNewProduct(@RequestBody Person person){


     return   peopleService.createNewPerson(person);

    }




}
