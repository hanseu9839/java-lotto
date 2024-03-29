package lotto.domain;

import lotto.domain.LottoBall;
import lotto.domain.PositiveNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LottoBallTest {
  private final static int LOWER_BOUND = 1;
  private final static int UPPER_BOUND = 45;

  @ParameterizedTest
  @ValueSource(ints = { LOWER_BOUND, UPPER_BOUND })
  void 입력_숫자_의_lottoball_생성(int input) {
    Assertions.assertThat(LottoBall.of(input)).isEqualTo(LottoBall.of(input));
  }
  
  @ParameterizedTest
  @ValueSource(ints = { LOWER_BOUND - 1, UPPER_BOUND + 1 })
  void 입력_숫자_제한이_있다(int input) {
    Assertions.assertThatThrownBy(() -> LottoBall.of(input))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(String.format("Wrong constructor argument!: %d", input));
  }
}
