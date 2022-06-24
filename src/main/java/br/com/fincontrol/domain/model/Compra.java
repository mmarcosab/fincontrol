package br.com.fincontrol.domain.model;

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
public class Compra {

    private String codigo;
    private String ticket;
    private BigDecimal valorNota;
    private Integer quantidade;
    private LocalDate data;

}
