package com.lsm1998.blog.domain.repository;

import com.lsm1998.blog.domain.model.blog.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends MongoRepository<String, Blog>
{

}
