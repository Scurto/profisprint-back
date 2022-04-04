package com.profisprint.learnReact.repository;

import com.profisprint.learnReact.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserModelRepository extends MongoRepository<UserModel, Long> {
}
