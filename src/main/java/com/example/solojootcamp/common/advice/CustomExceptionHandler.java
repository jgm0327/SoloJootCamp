package com.example.solojootcamp.common.advice;

import com.example.solojootcamp.common.dto.ErrorResponse;
import com.example.solojootcamp.common.error.ErrorCode;
import com.example.solojootcamp.common.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> notFoundException(NotFoundException notFoundException){

        String message = notFoundException.getErrorCode().getMessage();
        HttpStatus httpStatus = notFoundException.getErrorCode().getHttpStatus();

        return ResponseEntity.status(httpStatus).body(new ErrorResponse(message));
    }
}
