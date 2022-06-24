package br.com.fincontrol.domain.service;

import br.com.fincontrol.domain.model.Compra;

public interface CompraService {

    Compra criarRegistro(Compra compra);
    Compra alterarRegistro(Compra compra);
    Compra apagarRegistro(Integer codigo);
    Compra buscarRegistro(Integer codigo);
    Compra buscarRegistros();

}
