package com.todo.demo.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
public class UserDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

}
