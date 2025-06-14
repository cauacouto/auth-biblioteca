package com.example.auth_biblioteca.Users;

public enum UserRole {
    BIBLIOTECARIO("bibliotecario"),
    LEITOR("leitor");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
