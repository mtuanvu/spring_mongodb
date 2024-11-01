package com.authentication.springmongodb.repository;

import com.authentication.springmongodb.models.ERole;
import com.authentication.springmongodb.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
