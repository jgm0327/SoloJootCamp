package com.example.solojootcamp.board.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpsertRequest {
    private String title;
    private String description;

}
