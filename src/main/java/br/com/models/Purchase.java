package br.com.models;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Purchase {

    private Integer Id;
    private Client client;
    private List<Item> items;
    private BigDecimal totalPrice;
    private LocalDate purchaseDate;

    public void calculaTotalPrice() {
        totalPrice = BigDecimal.valueOf(items.stream().mapToDouble(item -> item.getPrice().doubleValue()).sum());
    }
}
