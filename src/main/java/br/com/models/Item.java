package br.com.models;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private LocalDate expireDate;

}
