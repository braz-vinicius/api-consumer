package br.infnet.consumerapi.controller;

import br.infnet.consumerapi.model.Proposicao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProposicaoApiController {
    @GetMapping("/api/proposicao")
    public Proposicao[] get() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "http://localhost:8080/api/proposicao";
        ResponseEntity<Proposicao[]> response
                = restTemplate.getForEntity(apiUrl, Proposicao[].class);

        return response.getBody();
    }
    @PostMapping("/api/proposicao")
    public Proposicao post() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "http://localhost:8080/api/proposicao";

        Proposicao proposicao = new Proposicao();
        proposicao.setNomeProposicao("Você é a favor do voto obrigatório? ");
        proposicao.setTema("Direito Eleitoral");

        ResponseEntity<Proposicao> response
                = restTemplate.postForEntity(apiUrl, proposicao, Proposicao.class);

        return response.getBody();
    }
}
