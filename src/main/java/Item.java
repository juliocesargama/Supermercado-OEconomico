import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

public class Item {
    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private BigDecimal price;

    @Getter @Setter
    private Integer quantity;

    @Getter @Setter
    private Date expireDate;

    public Item(Integer id, String name, BigDecimal price, Integer quantity, Date expireDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expireDate = expireDate;
    }
}
