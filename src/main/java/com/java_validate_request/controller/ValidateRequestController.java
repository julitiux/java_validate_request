package com.java_validate_request.controller;

import com.java_validate_request.model.UserCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class ValidateRequestController {

  @PostMapping("/post")
  public void post(@RequestBody UserCommand command) {
    log.info("{}", command.getUsername());
    log.info("{}", command.getEmail());
  }

}
