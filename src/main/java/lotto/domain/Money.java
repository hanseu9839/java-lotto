package lotto.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {
    public static final Money ZERO = new Money(BigDecimal.ZERO);

    private final BigDecimal amount;

    Money(BigDecimal amount) {
        this.amount = amount;
    }

    public static Money of(Long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money of(Integer amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money add(Money money) {
        return new Money(amount.add(money.amount));
    }

    public Money multiply(Integer count) {
        return new Money(amount.multiply(BigDecimal.valueOf(count)));
    }

    public Integer divide(Money money) {
        checkDivisorNotZero(money);
        return amount.divide(money.amount, 0, RoundingMode.FLOOR).intValue();
    }

    public BigDecimal divide(Money money, int scale, RoundingMode roundingMode) {
        checkDivisorNotZero(money);
        return amount.divide(money.amount, scale, roundingMode);
    }

    public Money remainder(Money money) {
        checkDivisorNotZero(money);
        return new Money(amount.remainder(money.amount));
    }

    public boolean isDivisibleBy(Money money) {
        return remainder(money).equals(ZERO);
    }

    public boolean isLesserThan(Money money) {
        return amount.compareTo(money.amount) < 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return amount.toString();
    }

    private void checkDivisorNotZero(Money money) {
        if (money == ZERO) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
    }
}
