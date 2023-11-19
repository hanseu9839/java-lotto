# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

---

## 🚀 1단계 - 문자열 계산기
### 기능 요구사항
* 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
* 입력 문자열의 숫자와 사칙 연산 사이에는 **반드시 빈 공백 문자열**이 있다고 가정한다.
* **나눗셈의 경우 결과 값을 정수**로 떨어지는 값으로 한정한다.
* 문자열 계산기는 **사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정**된다.

### 프로그램 기능목록
#### contorller
* StringCalculatorController
  * 문자열 계산기를 실행할 controller
#### service
* Calculator
  * 입력된 문자열을 실제로 계산하는 클래스이다.
* ValidationCheck
  * 입력된 문자열이 형식에 맞게 들어왔는지 체크하는 클래스이다.
#### view
* InputView
    * 계산하고자 하는 문자열을 사용자에게 입력받는다.
* ResultView
    * 실행한 결과를 보여준다.


### 테스트케이스
* 입력된 문자열이 사칙연산 우선순위가 아닌 입력값의 순서에 따라 계산이 되는지 확인한다.
* 입력된 문자열이 null이거나 빈 공백 문자일 경우 IllegalArgumentException로 예외처리가 되는지 확인한다.
* 입력된 문자열의 홀수번째에 들어온 값이 숫자가 아닌 경우 IllegalArgumentException로 예외처리가 되는지 확인한다.
* 입력된 문자열의 짝수번째에 들어온 값이 사칙연산자가 아닌 경우 IllegalArgumentException로 예외처리가 되는지 확인한다.
---

## 🚀 2단계 - 로또(자동)
### 기능 요구사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.
* 자동으로 발급된 로또 번호를 출력한다.
* 발급이 완료되면 사용자가 당첨 번호를 입력한다.
* 당첨결과를 출력한다.
* 구매금액 대비 수익률을 출력한다.

### 프로그램 기능목록
#### contorller
* LottoController
  * 로또를 실행할 controller이다.
#### domain
* Buyer
  * 로또를 구매하고 당첨을 확인하는 도메인이다.
* LottoNumber
  * 로또 번호를 생성하는 도메인이다.
* Rank
  * 당첨에 관련된 번호일치 개수와 상금이 관리되는 enum 클래스이다.
* WinningNumber
  * 사용자에게 입력받은 당첨번호가 관리되는 도메인이다.
#### service
* ValidationCheck
  * 유효성을 체크하는 클래스이다.
#### view
* InputView
  * 사용자에게 입력받는 View이다.
* ResultView
  * 실행한 결과를 보여주는 View이다.
### 테스트케이스
* 구매하고자 하는 금액이 최소단위인 1000원 이상인지 유효성 테스트한다.
* 입력된 구매금액에 맞게 로또가 구매되는지 테스트한다.
* 사용자에게 입력받은 당첨번호가 6개인지 유효성 테스트한다.
* 사용자에게 입력받은 당첨번호중 중복된 번호가 없는지 유효성 테스트한다.
* 구매한 로또 번호와 당첨된 번호가 Rank 대상과 일치하는지 확인한다.