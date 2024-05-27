package com.example.solojootcamp.common.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "인증을 안 했습니다."),
    FORBIDDEN(HttpStatus.FORBIDDEN, "권한이 없습니다."),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),

    BOARD_NOT_FOUND(HttpStatus.NOT_FOUND, "해당하는 게시판을 찾을 수 없습니다.");


    private final String message;
    private final HttpStatus httpStatus;

    ErrorCode(HttpStatus httpStatus, String message){
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
