package com.example.solojootcamp.board.controller;

import com.example.solojootcamp.board.controller.dto.BoardResponse;
import com.example.solojootcamp.board.repository.BoardRepository;
import com.example.solojootcamp.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/boards")
@RestController
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;
    @GetMapping("")
    public ResponseEntity<List<BoardResponse>> getBoards(){
        List<BoardResponse> boards = boardService.getBoards()
                .stream().map(BoardResponse::from).toList();

        return ResponseEntity.ok(boards);
    }

    @GetMapping("/{boardId}")
    public ResponseEntity<BoardResponse> getBoard(@PathVariable("boardId") long id){
        BoardResponse board = BoardResponse.from(boardService.getBoard(id));

        return ResponseEntity.ok(board);
    }

}
