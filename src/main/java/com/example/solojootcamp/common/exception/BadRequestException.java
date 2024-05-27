package com.example.solojootcamp.common.exception;

import com.example.solojootcamp.common.error.ErrorCode;
import lombok.Getter;

@Getter
public class BadRequestException extends RuntimeException{

    private final ErrorCode errorCode;
    public BadRequestException(ErrorCode errorCode){
        super();
        this.errorCode = errorCode;
    }
}
