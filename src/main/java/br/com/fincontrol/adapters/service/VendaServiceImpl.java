package br.com.fincontrol.adapters.service;

import br.com.fincontrol.adapters.database.repository.VendaRepository;
import br.com.fincontrol.adapters.database.representation.VendaData;
import br.com.fincontrol.domain.model.Venda;
import br.com.fincontrol.domain.service.VendaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendaServiceImpl implements VendaService {

    private final VendaRepository vendaRepository;

    private ModelMapper modelMapper;


    @Override
    public Venda criarRegistro(Venda venda) {
        return null;
    }

    @Override
    public Venda alterarRegistro(Venda venda) {
        return null;
    }

    @Override
    public Venda apagarRegistro(Integer codigo) {
        return null;
    }

    @Override
    public Venda buscarRegistro(Integer codigo) {
        return null;
    }

    @Override
    public Venda buscarRegistros() {
        return null;
    }

}
