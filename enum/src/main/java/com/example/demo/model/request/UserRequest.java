package com.example.demo.model.request;

import com.example.demo.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequest {

private Long id;

private String name;

private String email;

private Status status;


}
