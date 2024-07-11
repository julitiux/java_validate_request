package com.java_validate_request.controller;

import com.java_validate_request.model.UserCommand;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Validated
@RestController
@RequestMapping("/api")
public class ValidateRequestController {

  @PostMapping("/post")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void post(@Valid @RequestBody UserCommand command) {
    log.info("{}", command.getUsername());
    log.info("{}", command.getEmail());
  }

}
