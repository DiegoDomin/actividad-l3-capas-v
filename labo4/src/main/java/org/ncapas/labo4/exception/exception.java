package org.ncapas.labo4.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class exception extends RuntimeException {
    public exception(String msg) {
        super(msg);
    }
}
