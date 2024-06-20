package com.example.demo.service;

import com.example.demo.model.request.UserRequest;

public interface UserService {


    Object saveOrUpdateUser(UserRequest userRequest);
}
