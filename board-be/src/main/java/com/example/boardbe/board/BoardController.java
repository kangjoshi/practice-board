package com.example.boardbe.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/boards")
@RestController
@RequiredArgsConstructor
public class BoardController {

  private final BoardService boardService;

  @GetMapping
  public List<Board> list() {
    return boardService.list();
  }

  @GetMapping("/{id}")
  public Board get(@PathVariable Long id) {
    return boardService.get(id);
  }

  @PostMapping
  public Board save(@RequestBody Board board) {
    return boardService.save(board);
  }

  @DeleteMapping("/{id}")
  public void delete(Long id) {
    boardService.delete(id);
  }
}
