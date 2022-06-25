package br.com.fincontrol.adapters.controller;

import br.com.fincontrol.adapters.controller.representation.VendaRequestRepresention;
import br.com.fincontrol.adapters.controller.representation.VendaResponseRepresention;
import br.com.fincontrol.domain.model.Venda;
import br.com.fincontrol.domain.service.VendaService;
import br.com.fincontrol.util.MapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/vendas")
@RequiredArgsConstructor
public class VendaController {

    private final VendaService vendaService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody VendaRequestRepresention request){
        var result = vendaService.criarRegistro(MapperUtils.map(request, Venda.class));
        var response = MapperUtils.map(result, VendaResponseRepresention.class);
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{codigo}")
    public ResponseEntity<?> update(@PathVariable Integer codigo, @RequestBody VendaRequestRepresention request){
        var result = vendaService.alterarRegistro(MapperUtils.map(request, Venda.class), codigo);
        var response = MapperUtils.map(result, VendaResponseRepresention.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<?> getById(@PathVariable Integer codigo){
        var result = vendaService.buscarRegistro(codigo);
        var response = MapperUtils.map(result, VendaResponseRepresention.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        // it's not so good, refactor it
        var result = vendaService.buscarRegistros();
        List<VendaResponseRepresention> listResponse = new ArrayList<>();
        for(Venda v : result){
            listResponse.add(MapperUtils.map(v, VendaResponseRepresention.class));
        }
        return ResponseEntity.ok(listResponse);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<?> deleteById(@PathVariable Integer codigo){
        vendaService.apagarRegistro(codigo);
        return ResponseEntity.noContent().build();
    }

}
