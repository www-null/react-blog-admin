package com.lsm1998.blog.presentation.controller;

import com.lsm1998.blog.presentation.dto.LoginDto;
import graphql.annotations.annotationTypes.GraphQLType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@GraphQLType
public class UsersController
{
    @PostMapping("/login")
    public Object login(@RequestBody LoginDto loginDto)
    {
        return null;
    }
}
