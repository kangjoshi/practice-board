package com.example.boardbe.monitor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitors")
public class MonitorController {

  private boolean health = true;

  @GetMapping
  public ResponseEntity<Boolean> check() {
    var status = health ? HttpStatus.OK : HttpStatus.SERVICE_UNAVAILABLE;
    return new ResponseEntity<>(health, status);
  }

  @GetMapping("/up")
  public void up() {
    this.health = true;
  }

  @GetMapping("/down")
  public void down() {
    this.health = false;
  }
}
