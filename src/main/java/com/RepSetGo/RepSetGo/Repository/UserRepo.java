package com.RepSetGo.RepSetGo.Repository;

import com.RepSetGo.RepSetGo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {
}
