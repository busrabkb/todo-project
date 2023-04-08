package com.todo.demo.repository;

import com.todo.demo.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, String> {

}