package com.example.solojootcamp.board.service;

import com.example.solojootcamp.board.controller.dto.BoardResponse;
import com.example.solojootcamp.board.repository.BoardRepository;
import com.example.solojootcamp.board.service.dto.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<Board> getBoards(){
        return boardRepository.findAllByIsDeletedIsFalse()
                .stream().map(Board::from)
                .toList();
    }

    public Board getBoard(long id){
        return boardRepository.findByIdAndIsDeletedIsFalse(id).map(Board::from)
                .orElseThrow(() -> new IllegalArgumentException("없음"));
    }
}
