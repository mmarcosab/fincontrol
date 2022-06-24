package br.com.fincontrol.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrecoMedio {

    private String ticket;
    private BigDecimal precoMedio;
    private BigDecimal precoVenda;

}
