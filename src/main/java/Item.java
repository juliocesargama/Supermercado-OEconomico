import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Item {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Date expireDate;

}
