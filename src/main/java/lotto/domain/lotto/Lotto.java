package lotto.domain.lotto;

import lotto.domain.Prize;
import lotto.domain.lotto.generate.Generate;
import lotto.domain.lotto.ticket.LottoTicket;
import lotto.domain.lotto.ticket.LottoTickets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Lotto {

    private final LottoTickets lottoTickets;
    private final Generate lottoGenerate;

    public Lotto(LottoTickets lottoTickets, Generate lottoGenerate) {
        this.lottoTickets = lottoTickets;
        this.lottoGenerate = lottoGenerate;
    }

    public Map<Integer, Integer> getHitLottoNumbers(LottoTicket winningLottoTicket) {
        Map<Integer, Integer> map = new HashMap<>();
        lottoTickets.getHitNumbers(winningLottoTicket).stream().filter(number -> number >= 3).forEach(numbers -> {
            Prize prize = Prize.get(numbers);
            map.put(prize.getRank(), map.getOrDefault(prize.getRank(), 0) + 1);
        });

        return map;
    }

    public List<LottoTicket> getLottoTickets() {
        return lottoTickets.getTickets();
    }


    public LottoTicket getLastWeekWinningNumbers() {
        return lottoGenerate.generate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lotto lotto = (Lotto) o;
        return Objects.equals(lottoTickets, lotto.lottoTickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoTickets);
    }

}
