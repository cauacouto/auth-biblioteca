package com.example.auth_biblioteca.Users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private RoleUsers role;


}
