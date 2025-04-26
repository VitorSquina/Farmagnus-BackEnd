package com.farmagnus.farmagnus.user;

public record UserRequestDto(
        String nome_empresa,
        String nome_responsavel,
        String cnpj,
        String telefone,
        String email,
        String senha) {

}
