import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter @Setter
public class Item {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Date expireDate;

    public Item(Integer id, String name, BigDecimal price, Integer quantity, Date expireDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expireDate = expireDate;
    }
}
