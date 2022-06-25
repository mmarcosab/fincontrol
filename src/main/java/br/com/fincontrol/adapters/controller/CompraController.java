package br.com.fincontrol.adapters.controller;

import br.com.fincontrol.adapters.controller.representation.CompraResponseRepresention;
import br.com.fincontrol.adapters.controller.representation.CompraRequestRepresention;
import br.com.fincontrol.domain.model.Compra;
import br.com.fincontrol.domain.service.CompraService;
import br.com.fincontrol.util.MapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/compras")
@RequiredArgsConstructor
public class CompraController {

    private final CompraService compraService;
    private MapperUtils mapperUtils;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CompraRequestRepresention request){
        var result = compraService.criarRegistro(MapperUtils.map(request, Compra.class));
        var response = MapperUtils.map(request, CompraResponseRepresention.class);
        return ResponseEntity.ok(response);
    }

}
