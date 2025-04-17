package com.example.pc_demo.Exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestHandler extends RuntimeException {
    public BadRequestHandler(String message) {
        super(message);
    }
}
