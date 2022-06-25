package br.com.fincontrol.domain.service;

import br.com.fincontrol.domain.model.Venda;

import java.util.List;

public interface VendaService {

    Venda criarRegistro(Venda venda);
    Venda alterarRegistro(Venda venda, Integer codigo);
    void apagarRegistro(Integer codigo);
    Venda buscarRegistro(Integer codigo);
    List<Venda> buscarRegistros();

}
