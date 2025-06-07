package com.example.auth_biblioteca.repository;

import com.example.auth_biblioteca.domin.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livros, Long> {

}
