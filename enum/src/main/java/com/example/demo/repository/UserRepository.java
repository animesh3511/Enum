package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.util.resources.cldr.mg.LocaleNames_mg;

public interface UserRepository extends JpaRepository<User, Long> {


}
