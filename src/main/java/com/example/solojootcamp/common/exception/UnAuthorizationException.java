package com.example.solojootcamp.common.exception;

import com.example.solojootcamp.common.error.ErrorCode;
import lombok.Getter;

@Getter
public class UnAuthorizationException extends RuntimeException{

    private final ErrorCode errorCode;
    public UnAuthorizationException(ErrorCode errorCode){
        super();
        this.errorCode = errorCode;
    }
}
