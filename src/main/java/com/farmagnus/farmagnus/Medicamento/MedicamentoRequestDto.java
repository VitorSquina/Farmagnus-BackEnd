package com.farmagnus.farmagnus.Medicamento;

public record MedicamentoRequestDto(
        String codigo_de_barras,
        Long preco,
        String nome,
        String laboratorio,
        String apresentacao,
        String descricao,
        Boolean exibir_catalogo,
        String imagem) {


}