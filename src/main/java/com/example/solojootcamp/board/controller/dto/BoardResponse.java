package com.example.solojootcamp.board.controller.dto;

import com.example.solojootcamp.board.service.dto.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardResponse {
    private String title;
    private String description;

    private String writer;

    public static BoardResponse from(Board board){
        return new BoardResponse(board.getTitle(), board.getDescription(), board.getWriter());
    }
}
