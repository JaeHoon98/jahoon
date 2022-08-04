package zhomework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String gear = "";            // 기어
		String me = "";              // 메뉴
		String reverse = "";         // 후진기어
		String speed = "";           // 속도
		
		int speed1 = 10;
		int speed2 = 20;
		int speed3 = 30;
		int speed4 = 40;
		int speed5 = 50;
		int speed6 = 100;           // 속도
		
		String tire = "";           // 타이어
		
		String window = "";
		String windowdow = "";
		String windowdow1 = "";
		String windowdow2 = "";
		String windowdow3 = "";
		String windowdow4 = "";     // 창문
		
		String gambak = "";         // 깜빡이
		
		String wiper = "";          // 와이퍼
		
		boolean run = true;               // 입력문구를 반복실행하기 위한 변수
		
		long start = System.currentTimeMillis();      // 프로그램 실행 시간 측정 시작
		
		
		System.out.println(" 자동차가 출발합니다. 안전운전하세요.");
		while(run) {
			System.out.println("| 1. 기어변속 / 현재속도 | 3. 타이어교체 | 4. 창문왼쪽앞 | 5. 창문오른쪽앞 | 6. 창문왼쪽뒤 | 7. 창문오른쪽뒤 |");
			System.out.println("| 8. 깜빡이 | 9. 와이퍼 | 10. 현재상태 | 11. 급브레이크 | 12. 종료 |");
			me = scanner.nextLine();
			if(me.equals("1")) {                                            // 기어변속 선택
				System.out.println("몇단으로 하시겠습니까 : ");
				gear = scanner.nextLine();
				
				if(gear.equals("1")) {
					System.out.println("기어 1단입니다.");
					System.out.println("현재속도 : " + speed1 + "km");
				}else if(gear.equals("2")) {
					System.out.println("기어 2단입니다.");
					System.out.println("현재속도 : " + speed2 + "km");
				}else if(gear.equals("3")) {
					System.out.println("기어 3단입니다.");
					System.out.println("현재속도 : " + speed3 + "km");
				}else if(gear.equals("4")) {
					System.out.println("기어 4단입니다.");
					System.out.println("현재속도 : " + speed4 + "km");
				}else if(gear.equals("5")) {
					System.out.println("기어 5단입니다.");
					System.out.println("현재속도 : " + speed5 + "km");
				}else if(gear.equals("6")) {
					System.out.println("기어 6단입니다.");
					System.out.println("현재속도 : " + speed6 + "km 이상입니다.");
				}else if(gear.equals("R")) {
					System.out.println("" + reverse);
				}
				
				
			}else if(me.equals("3")) {                                     // 타이어 교체
				System.out.println("무슨 타이어로 교체하겠습니까 : | 미쉐린 타이어 | 금호 타이어 | 한국 타이어 | 컨티넨탈 타이어 |");
				tire = scanner.nextLine();
				if(tire.equals("미쉐린 타이어")) {
					System.out.println("미쉐린 타이어로 교체했습니다.");
				}else if(tire.equals("금호 타이어")) {
					System.out.println("금호 타이어로 교체했습니다.");
				}else if(tire.equals("한국 타이어")) {
					System.out.println("한국 타이어로 교체했습니다.");
				}else if(tire.equals("컨티넨탈 타이어")) {
					System.out.println("컨티넨탈 타이어로 교체했습니다.");
				}
				
				
			}else if(me.equals("4")) {                                    // 왼쪽 앞 창문
				System.out.println("| 열기 | 닫기 |");
				windowdow = scanner.nextLine();
				if(windowdow1.equals("열기")) {
					System.out.println("왼쪽 앞 창문을 열었습니다.");	
				}else if(windowdow1.equals("닫기")) {
					System.out.println("왼쪽 앞 창문을 닫았습니다.");
				}
			}else if(me.equals("5")) {                                   // 오른쪽 앞 창문
				System.out.println("| 열기 | 닫기 |");
				windowdow2 = scanner.nextLine();
				if(windowdow2.equals("열기")) {
					System.out.println("오른쪽 앞 창문을 열었습니다.");	
				}else if(windowdow2.equals("닫기")) {
					System.out.println("오른쪽 앞 창문을 닫았습니다.");
				}
			}else if(me.equals("6")) {                                  // 왼쪽 뒤 창문
				System.out.println("| 열기 | 닫기 |");
				windowdow3 = scanner.nextLine();
				if(windowdow3.equals("열기")) {
					System.out.println("왼쪽 뒤 창문을 열었습니다.");	
				}else if(windowdow3.equals("닫기")) {
					System.out.println("왼쪽 뒤 창문을 닫았습니다.");
				}
			}else if(me.equals("7")) {                                  // 오른쪽 뒤 창문
				System.out.println("| 열기 | 닫기 |");
				windowdow4 = scanner.nextLine();
				if(windowdow4.equals("열기")) {
					System.out.println("오른쪽 뒤 창문을 열었습니다.");	
				}else if(windowdow4.equals("닫기")) {
					System.out.println("오른쪽 뒤 창문을 닫았습니다.");
				}
			}else if(me.equals("8")) {                                  // 깜빡이
				System.out.println("| 왼쪽 | 오른쪽 | 비상 깜빡이 | 끄기 | ");
				gambak = scanner.nextLine();
				
				if(gambak.equals("왼쪽")) {
					System.out.println("왼쪽 깜빡이를 켭니다.");
				}else if(gambak.equals("오른쪽")) {
					System.out.println("오른쪽 깜빡이를 켭니다.");
				}else if(gambak.equals("비상 깜빡이")) {
					System.out.println("비상 깜빡이를 켭니다.");
				}else if(gambak.equals("끄기")) {
					System.out.println("깜빡이를 끕니다.");
				}
			}
				
			else if(me.equals("9")) {                                  // 와이퍼
				System.out.println("1. 와이퍼켜기, 2. 와이퍼끄기 : ");
				wiper = scanner.nextLine();
				if(wiper.equals("1")) {
					System.out.println("와이퍼를 켭니다.");
				}else if(wiper.equals("2")) {
					System.out.println("와이퍼를 끕니다.");
				}
			}
				
			else if(me.equals("10")) {                                // 현재상태
				
				System.out.println("==========현재상태===========");
				System.out.println("기어 : (" + gear +")단");
				System.out.println("속도 : (" + gear + "0)" + "km");
				System.out.println("타이어 : (" + tire + ")입니다.");
				System.out.println("왼쪽 앞 창문 : (" + windowdow1 + ") 상태입니다.");
				System.out.println("오른쪽 앞 창문 : (" + windowdow2 + ") 상태입니다.");
				System.out.println("왼쪽 뒤 창문 : (" + windowdow3 + ") 상태입니다.");
				System.out.println("오른쪽 뒤 창문 : (" + windowdow4 + ") 상태입니다.");
				System.out.println("깜빡이 : (" + gambak + ") 상태입니다.");
				
				
			}else if(me.equals("11")) {                              // 급브레이크
				gear = "";
				System.out.println("기어 : " + gear  + "단");
				System.out.println("현재속도 : 0" + gear + "km");
				//현재속도 리셋
			}else if(me.equals("12")) {                              // 종료
				long end = System.currentTimeMillis();               // 프로그램 종료 시간 
				System.out.println("차량 운행시간 : " + (end - start)/1000.0  + "초");         //차 운행 시간 보여주고
				System.out.println("안녕히계세요");
				break;
			}
		}
    }
}

