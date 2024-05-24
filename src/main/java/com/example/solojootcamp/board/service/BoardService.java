package com.example.solojootcamp.board.service;

import com.example.solojootcamp.board.repository.BoardRepository;
import com.example.solojootcamp.board.repository.entity.BoardEntity;
import com.example.solojootcamp.board.service.dto.Board;
import com.example.solojootcamp.board.service.dto.UpsertBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<Board> getBoards() {
        return boardRepository.findAllByIsDeletedIsFalse()
                .stream().map(Board::from)
                .toList();
    }

    public Board getBoard(long id) {
        return boardRepository.findByIdAndIsDeletedIsFalse(id).map(Board::from)
                .orElseThrow(() -> new IllegalArgumentException("없음"));
    }

    public void addBoard(UpsertBoard board) {
        boardRepository.save(board.toEntity());
    }

    @Transactional
    public void modifyBoard(UpsertBoard upsertBoard, long id){
        BoardEntity board = boardRepository
                .findById(id).orElseThrow(() -> new IllegalArgumentException("없음"));

        board.update(upsertBoard.getTitle(), upsertBoard.getDescription());
    }

    @Transactional
    public void deleteBoard(long id){
        BoardEntity board = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("없음"));
        board.setIsDeleted();
    }
}
