package com.example.solojootcamp.board.service.dto;

import com.example.solojootcamp.board.controller.dto.UpsertRequest;
import com.example.solojootcamp.board.repository.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpsertBoard {
    private String title;
    private String description;

    private String writer;
    public static UpsertBoard from(UpsertRequest request){
        return new UpsertBoard(request.getTitle(), request.getDescription(), "임시");
    }

    public BoardEntity toEntity(){
        return BoardEntity.builder()
                .title(this.title)
                .description(this.description)
                .build();

    }
}
