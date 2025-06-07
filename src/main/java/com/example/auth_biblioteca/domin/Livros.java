package com.example.auth_biblioteca.domin;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "livros")
@Getter
@EqualsAndHashCode(of = "id")
public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;

    public Livros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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
