package com.example.boardbe.board;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.ZonedDateTime;
import java.util.UUID;

@Accessors(chain = true)
@Data
@Entity
@Table(name = "board")
public class BoardEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String contents;

  private ZonedDateTime createdAt;

  private UUID createdBy;

  private ZonedDateTime modifiedAt;

  private UUID modifiedBy;

  public static BoardEntity from(Board board) {
    var now = ZonedDateTime.now();

    var entity = new BoardEntity()
            .setId(board.getId())
            .setName(board.getName())
            .setContents(board.getContents())
            .setModifiedBy(board.getUserId())
            .setModifiedAt(now);

    if (board.getId() == null) {
      entity.setCreatedBy(board.getUserId())
              .setCreatedAt(now);
    }
    return entity;
  }
}