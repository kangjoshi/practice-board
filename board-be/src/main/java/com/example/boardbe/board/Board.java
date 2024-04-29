package com.example.boardbe.board;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Accessors(chain = true)
public class Board {
  private Long id;

  private String name;

  private String contents;

  private ZonedDateTime createdAt;

  private UUID createdBy;

  private ZonedDateTime modifiedAt;

  private UUID modifiedBy;

  private UUID userId;

  public static Board from(BoardEntity entity) {
    return new Board()
            .setId(entity.getId())
            .setName(entity.getName())
            .setContents(entity.getContents())
            .setCreatedAt(entity.getCreatedAt())
            .setCreatedBy(entity.getCreatedBy())
            .setModifiedAt(entity.getModifiedAt())
            .setModifiedBy(entity.getModifiedBy());
  }
}