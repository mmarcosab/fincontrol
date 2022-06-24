package br.com.fincontrol.domain.service;

import br.com.fincontrol.domain.model.Venda;

public interface VendaService {

    Venda criarRegistro(Venda venda);
    Venda alterarRegistro(Venda venda);
    Venda apagarRegistro(Integer codigo);
    Venda buscarRegistro(Integer codigo);
    Venda buscarRegistros();

}
