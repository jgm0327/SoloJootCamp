package com.example.solojootcamp.board.exception;

import com.example.solojootcamp.common.error.ErrorCode;
import com.example.solojootcamp.common.exception.NotFoundException;
import lombok.Getter;

@Getter
public class BoardNotFoundException extends NotFoundException {

    public BoardNotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
