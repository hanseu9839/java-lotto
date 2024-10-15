package lotto.domain;

import java.util.HashMap;
import java.util.Map;

public enum Prize {

    FIRST(6, 2_000_000_000),
    SECOND(5, 1_500_000),
    THIRD(4, 50_000),
    FOUR(3, 5000);

    private final int rank;
    private final int price;
    private static final Map<Integer, Prize> map = new HashMap<>();

    static {
        for(Prize prize: values()) {
            map.put(prize.getRank(), prize);
        }
    }

    Prize(int rank, int price) {
        this.rank = rank;
        this.price = price;
    }

    public int getRank() {
        return rank;
    }

    public static Prize get(int rank) {
        return map.get(rank);
    }
}
