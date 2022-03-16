package br.com.models;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private LocalDate expireDate;

}
