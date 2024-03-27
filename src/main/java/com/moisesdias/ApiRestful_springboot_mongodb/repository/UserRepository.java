package com.moisesdias.ApiRestful_springboot_mongodb.repository;

import com.moisesdias.ApiRestful_springboot_mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
