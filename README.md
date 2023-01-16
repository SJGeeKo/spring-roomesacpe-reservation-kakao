# 기능 요구사항
- [x] 웹 요청 / 응답 처리로 입출력 추가 
  - [x] 예약 하기
  - [x] 예약 조회
  - [x] 예약 취소
- [x] 예외 처리
  - [x] 예약 생성 시 날짜와 시간이 똑같은 예약이 이미 있는 경우 예약을 생성할 수 없다.
- [x] 콘솔 애플리케이션에 데이터베이스를 적용한다.
  - [x] 직접 커넥션을 만들어서 데이터베이스에 접근한다.
- [x] 웹 애플리케이션에 데이터베이스를 적용한다.
  - [x] 스프링이 제공하는 기능을 활용하여 데이터베이스에 접근한다.
### 3단계 추가 기능 요구사항
- [x] 테마 관리 기능 추가
  - [x] 모든 테마의 시간표는 동일함
- [x] 요구사항에 없는 내용이 있다면 직접 요구사항을 추가해서 애플리케이션을 완성
  - [x] 실제 애플리케이션이라고 생각했을 때 발생할 수 있는 예외 상황을 고려하고 처리한다.

# 프로그래밍 요구사항
- 기존 콘솔 애플리케이션은 그대로 잘 동작해야한다.
- 콘솔 애플리케이션과 웹 애플리케이션의 중복 코드는 허용한다. (다음 단계에서 리팩터링 예정)
- 콘솔 애플리케이션과 웹 애플리케이션에서 각각 데이터베이스에 접근하는 로직을 구현한다. 
- 콘솔 애플리케이션에서 데이터베이스에 접근 시 JdbcTemplate를 사용하지 않는다. 직접 Connection을 생성하여 데이터베이스에 접근한다. 
- 웹 애플리케이션에서 데이터베이스 접근 시 JdbcTemplate를 사용한다. 
- 콘솔 애플리케이션과 웹 애플리케이션의 중복 코드 제거해본다.
### 3단계 추가 프로그래밍 요구사항
- [x] 테마를 관리하는 테이블을 추가한다.
- [x] 콘솔 애플리케이션과 웹 애플리케이션의 로직의 중복을 제거한다.
  - [x] 디비 접근을 담당하는 객체를 별도로 만들어 사용한다.
  - [x] 비즈니스 로직을 담당하는 객체를 별도로 만들어 사용한다.

# 리뷰 후 수정 필요한 사항
- [x] 인터페이스 내 변수들 제거 및 다른 방식으로 중복 제거
  - 인터페이스 대신 추상클래스 사용하는 방식으로 해결
- [x] 기존 jdbc 관련 config를 application.yml을 이용하는 방향으로 변경
- [x] 에러 발생시 적절한 HTTP 상태 코드 응답하도록 변경(400, 500...)
- [x] 커스텀 Exception 관련한 생성자 추가