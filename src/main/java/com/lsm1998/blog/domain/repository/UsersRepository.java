package com.lsm1998.blog.domain.repository;

import com.lsm1998.blog.domain.model.users.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<String, Users>
{
}
