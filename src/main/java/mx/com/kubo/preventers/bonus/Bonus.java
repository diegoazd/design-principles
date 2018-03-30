package mx.com.kubo.preventers.bonus;

import java.math.BigDecimal;

public interface Bonus {

    BigDecimal calculateBonus();
    String bonusType();
    String getHeader();
}
