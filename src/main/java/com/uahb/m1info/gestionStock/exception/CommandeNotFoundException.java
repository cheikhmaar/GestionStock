package com.uahb.m1info.gestionStock.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class CommandeNotFoundException extends RuntimeException {

    public CommandeNotFoundException(String message){
        super(message);
    }
}
