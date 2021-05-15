package com.productmanagement.services.repository;

import com.productmanagement.services.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
