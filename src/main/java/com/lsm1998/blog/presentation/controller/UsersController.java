package com.lsm1998.blog.presentation.controller;

import com.lsm1998.blog.presentation.dto.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController
{
    @PostMapping("/login")
    public Object login(@RequestBody LoginDto loginDto)
    {
        return null;
    }
}
