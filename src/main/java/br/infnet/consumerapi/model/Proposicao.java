package br.infnet.consumerapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

public class Proposicao {
    private String nomeProposicao;
    private String tema;
    private Integer id;

    public String getNomeProposicao() {
        return nomeProposicao;
    }

    public void setNomeProposicao(String nomeProposicao) {
        this.nomeProposicao = nomeProposicao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
