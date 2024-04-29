package com.example.boardbe.board;

import com.example.boardbe.board.exception.BoardNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {

  private final BoardRepository repository;

  public List<Board> list() {
    return repository.findAll().stream()
            .map(Board::from)
            .toList();
  }

  public Board get(Long id) {
    return repository.findById(id)
            .map(Board::from)
            .orElseThrow(BoardNotFoundException::new);
  }

  public Board save(Board board) {
    var entity = BoardEntity.from(board);
    var saved = repository.save(entity);
    return Board.from(saved);
  }

  public void delete(Long id) {
    var board = get(id);
    repository.delete(BoardEntity.from(board));
  }
}
