package com.example.solojootcamp.board.repository.entity;

import com.example.solojootcamp.board.service.dto.Board;
import com.example.solojootcamp.common.base.BaseModifyEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "board")
public class BoardEntity extends BaseModifyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String description;

}
