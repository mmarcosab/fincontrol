package br.com.fincontrol.domain.service;

import br.com.fincontrol.domain.model.Compra;

import java.util.List;

public interface CompraService {

    Compra criarRegistro(Compra compra);
    Compra alterarRegistro(Compra compra, Integer codigo);
    void apagarRegistro(Integer codigo);
    Compra buscarRegistro(Integer codigo);
    List<Compra> buscarRegistros();

}
