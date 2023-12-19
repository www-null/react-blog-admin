package com.lsm1998.blog.presentation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler
{
    private static final String RESULT_TEMPLATE = "{\"code\":%d,\"msg\":\"%s\"}";

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<String> handleException(Exception e)
    {
        return new ResponseEntity<>(String.format(RESULT_TEMPLATE, 500, e.getMessage()), HttpStatus.OK);
    }
}
