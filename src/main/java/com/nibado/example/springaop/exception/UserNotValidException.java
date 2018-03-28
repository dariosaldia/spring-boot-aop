package com.nibado.example.springaop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Order")
public class UserNotValidException extends RuntimeException {
  
  private static final long serialVersionUID = 2753403792025073894L;

  public UserNotValidException(String msg) {
    super(msg);
  }

}
