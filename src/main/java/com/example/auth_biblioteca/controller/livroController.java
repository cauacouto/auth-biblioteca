package com.example.auth_biblioteca.controller;

import com.example.auth_biblioteca.DTO.LivroRequestDto;
import com.example.auth_biblioteca.DTO.LivroResponseDto;
import com.example.auth_biblioteca.domin.Livros;
import com.example.auth_biblioteca.repository.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class livroController {
    @Autowired
    private LivroRepository repository;

    @PostMapping
    public ResponseEntity livros(@RequestBody @Valid LivroRequestDto body){
        Livros newlivro = new Livros(body);
        this.repository.save(newlivro);
        return ResponseEntity.ok().build();

    }

    @GetMapping
    public ResponseEntity listarLivros(){
        List<LivroResponseDto> livroList = this.repository.findAll().stream()
                .map(LivroResponseDto::new)
                .toList();
        return ResponseEntity.ok(livroList);
    }

    }

