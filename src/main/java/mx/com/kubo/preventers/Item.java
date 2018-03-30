package mx.com.kubo.preventers;

import java.math.BigDecimal;

public class Item {

    private int itemId;
    private String name;
    private BigDecimal price;

    public Item(int itemId, String name, BigDecimal price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
