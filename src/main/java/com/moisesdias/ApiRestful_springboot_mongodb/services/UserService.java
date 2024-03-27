package com.moisesdias.ApiRestful_springboot_mongodb.services;

import com.moisesdias.ApiRestful_springboot_mongodb.domain.User;
import com.moisesdias.ApiRestful_springboot_mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}