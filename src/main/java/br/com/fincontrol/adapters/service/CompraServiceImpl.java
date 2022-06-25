package br.com.fincontrol.adapters.service;

import br.com.fincontrol.adapters.database.repository.CompraRepository;
import br.com.fincontrol.adapters.database.representation.CompraData;
import br.com.fincontrol.domain.model.Compra;
import br.com.fincontrol.domain.service.CompraService;
import br.com.fincontrol.util.MapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompraServiceImpl implements CompraService {

    private final CompraRepository repository;

    @Override
    public Compra criarRegistro(Compra compra) {
        var compraArmazenada =  repository.save(MapperUtils.map(compra, CompraData.class));
        return MapperUtils.map(compraArmazenada, Compra.class);
    }

    @Override
    public Compra alterarRegistro(Compra compra) {
        return null;
    }

    @Override
    public Compra apagarRegistro(Integer codigo) {
        return null;
    }

    @Override
    public Compra buscarRegistro(Integer codigo) {
        return null;
    }

    @Override
    public Compra buscarRegistros() {
        return null;
    }

}
