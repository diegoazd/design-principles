package mx.com.kubo.preventers;

import java.math.BigDecimal;

public interface Bonus {

    BigDecimal calculateBonus();
    String bonusType();
}
