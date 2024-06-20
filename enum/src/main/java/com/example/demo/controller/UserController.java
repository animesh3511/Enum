package com.example.demo.controller;

import com.example.demo.model.request.UserRequest;
import com.example.demo.model.response.CustomEntityResponse;
import com.example.demo.model.response.EntityResponse;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping("/saveOrUpdateUser")
  public ResponseEntity<?> saveOrUpdateUser(@RequestBody UserRequest userRequest)
  {
      try{

          return new ResponseEntity(new EntityResponse(userService.saveOrUpdateUser(userRequest),0), HttpStatus.OK);

      }catch (Exception e)
      {

       return new ResponseEntity(new CustomEntityResponse(e.getMessage(),-1),HttpStatus.OK);
      }





  }


}
