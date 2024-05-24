package com.example.solojootcamp.board.repository.entity;

import com.example.solojootcamp.common.base.BaseModifyEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardEntity extends BaseModifyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String description;

    @Builder
    public BoardEntity(String title, String description){
        this.title = title;
        this.description = description;
    }
}
