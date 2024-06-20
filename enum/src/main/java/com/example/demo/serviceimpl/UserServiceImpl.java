package com.example.demo.serviceimpl;

import com.example.demo.model.Status;
import com.example.demo.model.User;
import com.example.demo.model.request.UserRequest;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Object saveOrUpdateUser(UserRequest userRequest) {

    if (userRepository.existsById(userRequest.getId()))
    {

        User user = userRepository.findById(userRequest.getId()).get();

        user.setId(userRequest.getId());
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setStatus(Status.INACTIVE);

        userRepository.save(user);
        return "user updated succesfully";
    }
    else
    {
        User user = new User();

        user.setId(userRequest.getId());
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setStatus(Status.ACTIVE);

        userRepository.save(user);

        return "user saved succesfully";
    }



    }
}
