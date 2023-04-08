package com.todo.demo.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
@Document
@Getter
@Builder
@Setter
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;

}