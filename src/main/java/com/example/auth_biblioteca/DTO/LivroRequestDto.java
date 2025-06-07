package com.example.auth_biblioteca.DTO;

import jakarta.validation.constraints.NotBlank;

public record LivroRequestDto(
   @NotBlank String titulo,
    @NotBlank String autor
) {

}
