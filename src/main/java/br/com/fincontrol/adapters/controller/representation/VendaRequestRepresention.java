package br.com.fincontrol.adapters.controller.representation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VendaRequestRepresention {

    private String ticket;
    private BigDecimal valorNota;
    private Integer quantidade;
    private LocalDate data;

}
