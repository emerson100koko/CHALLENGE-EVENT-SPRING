package com.devsuperior.evento.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String descricao;
    @OneToMany(mappedBy = "categoria")
    private List<com.devsuperior.evento.entities.Atividade> atividades = new ArrayList<>();

    public Categoria(){
    }

    public Categoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<com.devsuperior.evento.entities.Atividade> getAtividades() {
        return atividades;
    }
}
