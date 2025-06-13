package com.farmagnus.farmagnus.user;

public record UserDto(
        Long id,
        String nome_empresa,
        String nome_responsavel,
        String cnpj,
        String telefone,
        String email,
        String senha) {
    public UserDto(User user){
        this(user.getId(), user.getNome_empresa(),user.getNome_responsavel(), user.getCnpj(), user.getTelefone(), user.getEmail(), user.getSenha());
    }
}
