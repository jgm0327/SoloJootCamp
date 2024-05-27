package com.example.solojootcamp.common.exception;

import com.example.solojootcamp.common.error.ErrorCode;
import lombok.Getter;

@Getter
public class ForbiddenException extends RuntimeException{

    private final ErrorCode errorCode;
    public ForbiddenException(ErrorCode errorCode){
        super();
        this.errorCode = errorCode;
    }
}
