package com.emsforuniversity.authenticationserver.repository;

import com.emsforuniversity.authenticationserver.model.Credential;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends MongoRepository<Credential, String> {
}