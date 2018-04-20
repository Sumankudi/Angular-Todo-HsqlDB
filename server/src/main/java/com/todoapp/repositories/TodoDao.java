package com.todoapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.models.Todo;
@Repository
public interface TodoDao extends CrudRepository<Todo, Long> {

}
