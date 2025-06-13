package com.farmagnus.farmagnus.user;

import com.farmagnus.farmagnus.Medicamento.Medicamento;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "users_farmacia")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome_empresa;

    private String nome_responsavel;

    private String cnpj;

    private String telefone;

    private String email;

    private String senha;

    public User(Medicamento.UserRequestDto data){
        this.nome_empresa = data.nome_empresa();
        this.nome_responsavel = data.nome_responsavel();
        this.cnpj = data.cnpj();
        this.telefone = data.telefone();;
        this.email = data.email();
        this.senha = data.senha();
    }
}


