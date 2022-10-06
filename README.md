# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## Step1 문자열 계산기
- 문자열 계산기 구현

## Step2 로또(자동)
- 로또 자동 생성 기능 구현
- 로또 객체 구현
- 로또들 객체 구현
- InputView, ResultView 구현
- 당첨 통계 

## Step3 로또(2등)
- 보너스 볼을 위한 추가 번호 추가
- 당첨 통계에 2등 추가

## Step4 로또(수동)
- 수동으로 로또 번호를 입력할 수 있는 기능 추가
- 예외 처리
  - 구입금액은 로또가격이상이고 로또가격 단위이이어야 합니다.
  - 수동으로 구매할 로또 수는 0개 이상, 구입개수 이하여야 합니다.
  - 로또번호 입력시 로또 숫자는 1이상 45이하 정수여야 합니다.
  - 로또번호 입력시 6개 숫자를 입력해야 합니다.