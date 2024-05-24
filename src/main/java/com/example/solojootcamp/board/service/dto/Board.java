package com.example.solojootcamp.board.service.dto;


import com.example.solojootcamp.board.repository.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private String title;
    private String description;

    private String writer;

    public static Board from(BoardEntity board){
        return new Board(board.getTitle(), board.getDescription(), board.getCreatedBy());
    }
}
