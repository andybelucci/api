package br.com.projeto.api.model;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data

public class Cliente {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long codigo;

    private String nome;

    private int idade;

    private String cidade;

}
