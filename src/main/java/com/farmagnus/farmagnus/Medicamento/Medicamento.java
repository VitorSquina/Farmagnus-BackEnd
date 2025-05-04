package com.farmagnus.farmagnus.Medicamento;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "medicamento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo_de_barras;

    private String nome;

    private Long preco;

    private String laboratorio;

    private String apresentacao;

    private String descricao;

    private Boolean exibir_catalogo;

    private String imagem;

    public Medicamento(MedicamentoRequestDto data) {
        this.codigo_de_barras = data.codigo_de_barras();
        this.nome = data.nome();
        this.preco = data.preco();
        this.laboratorio = data.laboratorio();
        this.apresentacao = data.apresentacao();
        this.descricao = data.descricao();
        this.exibir_catalogo = data.exibir_catalogo();
        this.imagem = data.imagem();
    }


    public static record UserRequestDto(
            String nome_empresa,
            String nome_responsavel,
            String cnpj,
            String telefone,
            String email,
            String senha) {

    }
}
