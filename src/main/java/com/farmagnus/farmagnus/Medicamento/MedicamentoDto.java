package com.farmagnus.farmagnus.Medicamento;

public record MedicamentoDto (
        Long id,
        String codigo_de_barras,
        String nome,
        Long preco,
        String laboratorio,
        String apresentacao,
        String descricao,
        Boolean exibit_catalogo,
        String imagem) {
    public MedicamentoDto(Medicamento medicamento){
        this(
                medicamento.getId(),
                medicamento.getCodigo_de_barras(),
                medicamento.getNome(),
                medicamento.getPreco(),
                medicamento.getLaboratorio(),
                medicamento.getApresentacao(),
                medicamento.getDescricao(),
                medicamento.getExibir_catalogo(),
                medicamento.getImagem());
    }
}
