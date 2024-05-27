package com.example.solojootcamp.common.exception;

import com.example.solojootcamp.common.error.ErrorCode;
import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException{

    private final ErrorCode errorCode;
    public NotFoundException(ErrorCode errorCode){
        super();
        this.errorCode = errorCode;
    }
}
