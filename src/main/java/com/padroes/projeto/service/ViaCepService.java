package com.padroes.projeto.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.padroes.projeto.model.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name = "viacep")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
