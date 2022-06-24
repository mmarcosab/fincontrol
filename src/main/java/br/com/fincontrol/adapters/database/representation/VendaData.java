package br.com.fincontrol.adapters.database.representation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "venda")
public class VendaData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String ticket;

    @Column(name = "valor_nota")
    private BigDecimal valorNota;

    private Integer quantidade;

    private LocalDate data;

}
