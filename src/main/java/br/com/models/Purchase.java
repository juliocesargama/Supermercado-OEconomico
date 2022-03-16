package br.com.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {

    private Integer Id;
    private Client client;
    private List<Item> items;
    private BigDecimal totalPrice;
    private Date purchaseDate;
}
