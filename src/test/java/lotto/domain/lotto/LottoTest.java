package lotto.domain.lotto;

import lotto.domain.lotto.ticket.LottoTicket;
import lotto.domain.lotto.ticket.LottoTickets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class LottoTest {

    @Test
    @DisplayName("지난 주 당첨 번호 확인")
    void 지난_주_당첨_번호_확인() {
        Lotto lotto = new Lotto(null, () -> new LottoTicket("1,2,3,4,5,6"));

        assertThat(lotto.getLastWeekWinningNumbers()).isEqualTo(new LottoTicket("1,2,3,4,5,6"));
    }

    @Test
    @DisplayName("당첨 금액 별 개수 계산 테스트")
    void 당첨_금액_별_개수_계산() {
        Lotto lotto = new Lotto(new LottoTickets(new LottoTicket("1,2,3,4,5,6"), new LottoTicket("1,2,3,4,5,7")), () -> null);

        assertThat(lotto.getHitLottoNumbers(new LottoTicket(1, 2, 3, 4, 5, 6))).containsAllEntriesOf(Map.of(
                5, 1, // 1등이 1번 나와야 함
                6, 1  // 2등이 1번 나와야 함
        ));
    }

}
