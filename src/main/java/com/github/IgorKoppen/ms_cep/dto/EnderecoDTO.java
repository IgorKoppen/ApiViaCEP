package com.github.IgorKoppen.ms_cep.dto;

import com.github.IgorKoppen.ms_cep.model.Endereco;
import lombok.Getter;

@Getter
public class EnderecoDTO {
    private final String cep;
    private final String logradouro;
    private final String complemento;
    private final String bairro;
    private final String localidade;
    private final String uf;

    public EnderecoDTO(Endereco entity) {
        this.cep = entity.getCep();
        this.logradouro = entity.getLogradouro();
        this.complemento = entity.getComplemento();
        this.bairro = entity.getBairro();
        this.localidade = entity.getLocalidade();
        this.uf = entity.getUf();
    }


}
