package com.java_validate_request.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserCommand {

  @Size(max = 15, message = "should be max 15 characters")
  @NotNull(message = "the field cannot be null")
  @NotBlank(message = "the field cannot be empty")
  private String username;

  @Email(message = "invalid email")
  @NotNull(message = "the field cannot be null")
  private String email;

}
