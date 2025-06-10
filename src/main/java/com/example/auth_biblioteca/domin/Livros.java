package com.example.auth_biblioteca.domin;

import com.example.auth_biblioteca.DTO.LivroRequestDto;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "livros")
@Getter

public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;

    public Livros(LivroRequestDto data) {
        this.titulo = data.titulo();
        this.autor = data.autor();
    }
    public Livros() {}



    public Long getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
}
