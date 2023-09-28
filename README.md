to do list

Car 객체 생성 (VO인 CarName, Position 포함)
-Car move() : 특정 전략에 따라 1칸 이동 (Position 객체가 가진 int position 값 1증가된 새로운 Position 객체를 필드로 가지게 됨)
 -move함수의 전략을 인자로 전달

Cars 객체 생성 (일급리스트)
-Cars() : List<String> 받아서 CarList 생성
-Cars move() : Car리스트에 있는 car들에 move() 함수 적용

RacingService 객체 생성 static가능 
-String으로 전달된 carname을 유효성 검사 후 split해서 List<String>으로 Cars에 전달해서 Cars 생성
-Cars move()를 tryNum만큼 실행
-경기 후 우승자 구하는 함수()

InputView 객체 생성 static가능
-사용자한테 자동차이름과 시도횟수 받아서 RacingService에 전달

ResultView 객체 생성 static가능
-RacingService에서 시도횟수마다 결과값을 받아서 print
-시도횟수 전부 경기 진행 후 RacingService로부터 우승자받아서 print
