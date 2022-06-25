package br.com.fincontrol.adapters.service;

import br.com.fincontrol.adapters.database.repository.CompraRepository;
import br.com.fincontrol.adapters.database.representation.CompraData;
import br.com.fincontrol.domain.model.Compra;
import br.com.fincontrol.domain.service.CompraService;
import br.com.fincontrol.util.MapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


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
    public Compra alterarRegistro(Compra compra, Integer codigo) {
        compra.setCodigo(codigo);
        var compraArmazenada =  repository.save(MapperUtils.map(compra, CompraData.class));
        return MapperUtils.map(compraArmazenada, Compra.class);
    }

    @Override
    public void apagarRegistro(Integer codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public Compra buscarRegistro(Integer codigo) {
        var compraData = repository.findById(codigo);
        return MapperUtils.map(compraData, Compra.class);
    }

    @Override
    public List<Compra> buscarRegistros() {
        // it's not so good, refactor it
        var comprasData = repository.findAll();
        List<Compra> compras = new ArrayList<>();
        for(CompraData cd : comprasData){
            compras.add(MapperUtils.map(cd, Compra.class));
        }
        return compras;
    }

}
