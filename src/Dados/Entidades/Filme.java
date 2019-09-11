/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author IFNMG
 */
public class Filme {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeLançamento() {
        return dataDeLançamento;
    }

    public void setDataDeLançamento(LocalDate dataDeLançamento) {
        this.dataDeLançamento = dataDeLançamento;
    }

    public Double getArrecadacao() {
        return arrecadacao;
    }

    public void setArrecadacao(Double arrecadacao) {
        this.arrecadacao = arrecadacao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public void setAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }
    private String nome;
    private LocalDate dataDeLançamento;
    private Double arrecadacao;
    private Genero genero;
    private ArrayList<Ator> atores;
    
    
    
}
