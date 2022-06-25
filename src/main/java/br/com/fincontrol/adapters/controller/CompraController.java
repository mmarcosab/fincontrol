package br.com.fincontrol.adapters.controller;

import br.com.fincontrol.adapters.controller.representation.CompraResponseRepresention;
import br.com.fincontrol.adapters.controller.representation.CompraRequestRepresention;
import br.com.fincontrol.domain.model.Compra;
import br.com.fincontrol.domain.service.CompraService;
import br.com.fincontrol.util.MapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/compras")
@RequiredArgsConstructor
public class CompraController {

    private final CompraService compraService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CompraRequestRepresention request){
        var result = compraService.criarRegistro(MapperUtils.map(request, Compra.class));
        var response = MapperUtils.map(result, CompraResponseRepresention.class);
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{codigo}")
    public ResponseEntity<?> update(@PathVariable Integer codigo, @RequestBody CompraRequestRepresention request){
        var result = compraService.alterarRegistro(MapperUtils.map(request, Compra.class), codigo);
        var response = MapperUtils.map(result, CompraResponseRepresention.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<?> getById(@PathVariable Integer codigo){
        var result = compraService.buscarRegistro(codigo);
        var response = MapperUtils.map(result, CompraResponseRepresention.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        // it's not so good, refactor it
        var result = compraService.buscarRegistros();
        List<CompraResponseRepresention> listResponse = new ArrayList<>();
        for(Compra cd : result){
            listResponse.add(MapperUtils.map(cd, CompraResponseRepresention.class));
        }
        return ResponseEntity.ok(listResponse);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<?> deleteById(@PathVariable Integer codigo){
        compraService.apagarRegistro(codigo);
        return ResponseEntity.noContent().build();
    }

}
