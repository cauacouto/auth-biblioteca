package com.example.auth_biblioteca.DTO;

import com.example.auth_biblioteca.domin.Livros;

public record LivroResponseDto(Long id,String titulo, String autor) {

  public LivroResponseDto (Livros livro) {
    this(livro.getId(),livro.getTitulo(),livro.getAutor());
  }
}
