package com.example.solojootcamp.board.repository;

import com.example.solojootcamp.board.repository.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findAllByIsDeletedIsFalse();

    Optional<BoardEntity> findByIdAndIsDeletedIsFalse(long id);
}
