package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Integer> {

}
