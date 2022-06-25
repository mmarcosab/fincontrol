package br.com.fincontrol.adapters.service;

import br.com.fincontrol.adapters.database.repository.VendaRepository;
import br.com.fincontrol.adapters.database.representation.VendaData;
import br.com.fincontrol.domain.model.Venda;
import br.com.fincontrol.domain.service.VendaService;
import br.com.fincontrol.util.MapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VendaServiceImpl implements VendaService {

    private final VendaRepository repository;

    @Override
    public Venda criarRegistro(Venda venda) {
        var compraArmazenada =  repository.save(MapperUtils.map(venda, VendaData.class));
        return MapperUtils.map(compraArmazenada, Venda.class);
    }

    @Override
    public Venda alterarRegistro(Venda venda, Integer codigo) {
        venda.setCodigo(codigo);
        var compraArmazenada =  repository.save(MapperUtils.map(venda, VendaData.class));
        return MapperUtils.map(compraArmazenada, Venda.class);
    }

    @Override
    public void apagarRegistro(Integer codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public Venda buscarRegistro(Integer codigo) {
        var compraData = repository.findById(codigo);
        return MapperUtils.map(compraData, Venda.class);
    }

    @Override
    public List<Venda> buscarRegistros() {
        // it's not so good, refactor it
        var vendasData = repository.findAll();
        List<Venda> vendas = new ArrayList<>();
        for(VendaData cd : vendasData){
            vendas.add(MapperUtils.map(cd, Venda.class));
        }
        return vendas;
    }

}
