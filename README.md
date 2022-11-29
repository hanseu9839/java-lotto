# 로또 - TDD
## 1단계 - 문자열 계산기
### 요구사항
- 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
- 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
- 나눗셈의 경우, 결과 값을 정수로 떨어지는 값으로 한정한다. 
- 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
- indent depth 를 1단계로만.
- 메소드의 크기가 최대 10라인을 넘지 않도록 구현하고, 한 가지 일만 하도록 최대한 작게 만든다.
- else 를 사용하지 않는다.
### 기능 목록
- [x] 공백을 기준으로 입력 분리
- [x] 수식은 null 이거나 공백을 포함할 수 없다. 
- [x] 사칙 연산 기호는 +,-,/,* 만 허용된다.
- [x] 숫자끼리 사칙 연산을 할 수 있다.
- [x] 입력 순서로 사칙 연산을 한다. 
- [x] 입력 형식을 검증한다.
  - 숫자와 연산자는 번갈아 나오고, 숫자로 끝나야 한다.  