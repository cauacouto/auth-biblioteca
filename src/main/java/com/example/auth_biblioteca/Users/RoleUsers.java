package com.example.auth_biblioteca.Users;

public enum RoleUsers {
   BIBLIOTECARIO ("Bibliotecário"),
LEITOR ("leitor");

private String role;

    RoleUsers(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }



}
