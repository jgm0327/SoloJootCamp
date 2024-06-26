package com.example.solojootcamp.board.controller;

import com.example.solojootcamp.board.controller.dto.BoardResponse;
import com.example.solojootcamp.board.controller.dto.UpsertRequest;
import com.example.solojootcamp.board.service.BoardService;
import com.example.solojootcamp.board.service.dto.UpsertBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/boards")
@RestController
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;

    @GetMapping("")
    public ResponseEntity<List<BoardResponse>> getBoards() {
        List<BoardResponse> boards = boardService.getBoards()
                .stream().map(BoardResponse::from).toList();

        return ResponseEntity.ok(boards);
    }

    @GetMapping("/{boardId}")
    public ResponseEntity<BoardResponse> getBoard(@PathVariable("boardId") long id) {
        BoardResponse board = BoardResponse.from(boardService.getBoard(id));

        return ResponseEntity.ok(board);
    }

    @PostMapping("")
    public ResponseEntity<Void> addBoard(@RequestBody UpsertRequest upsertRequest) {
        boardService.addBoard(UpsertBoard.from(upsertRequest));
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{boardId}")
    public ResponseEntity<Void> modifyBoard(@RequestBody UpsertRequest upsertRequest, @PathVariable("boardId") long id) {
        boardService.modifyBoard(UpsertBoard.from(upsertRequest), id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{boardId}")
    public ResponseEntity<Void> deleteBoard(@PathVariable("boardId") long id) {
        boardService.deleteBoard(id);
        return ResponseEntity.ok().build();
    }
}

