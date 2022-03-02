package java_day07;

import java.util.Scanner;

public class LoopFinalTest {
	public static void main(String[] args) {
		// 복습시간
		
		
		// 팩토리얼
		// 수학기호로 4! 는 4 팩토리얼을 의미
		// 그 값은 4x3x2x1 = 24 이다.
		
		// for문을 사용하여 10팩토리얼의 값을 출력.
		// 결과 : 3628800
		// @ 15 팩토리얼의 값을 출력.
		// 결과 : 1307674368000
		
		//	Scanner sc = new Scanner(System.in);
		//	System.out.printf("정수입력>> ");
		//	x = sc.nextInt();

		int x = 15;
		long fac = 1; // 결과값을 길게 담아줄수있는 long함수
		
		for ( int i = x; i >= 1; i-- ) {
			fac = fac * i;
		}
		System.out.println(x + "! 은(는) "+ fac);
		
		System.out.println("\n============= 룰렛 이벤트 ==============\n");
		
		// 룰렛을 힘차게 돌렸더니
		// 5834도가 돌아갔다고 합니다,
		// 한바퀴는 360도
		
		// 그렇다면 룰렛이 멈추고난 각도에 따른 경품이
		// 뭔지 출력하고, 총 몇바퀴 돌아갔는지 출력하시오.
		// 0도 초과 ~ 60도 이하 : 사탕
		// 60도 초과 ~ 120도 이하 : 초콜릿
		// 120도 초과 ~ 180도 이하 : 쿠키
		// 180도 초과 ~ 240도 이하 : 콜라
		// 240도 초과 ~ 300도 이하 : 아이스크림
		// 300도 초과 ~ 360도(0도) 이하 : 커피 
	
		// System.out.println( 변수 + "바퀴" );
		// System.out.println( "경품: " + 변수 );
		
		int rul1 = 5834 / 360;
		int rul2 = (5834 - rul1) / 360;
		System.out.println(rul2 + "바퀴");
		
		if ( 60 < rul1 || rul1 <= 120  ) {
			System.out.println("초콜릿");
		}
		
//		System.out.println("\n=========== 로꾸꺼 ============\n");
//		
//		// 사용자가 입력한 문자열의 순서를 뒤집어서 출력해보시오.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("거꾸로 뒤집을 문자열 입력: ");
//		String inputText = sc.nextLine();
//		
//		// .charAT을 이용한 방법 
//		for ( int i = inputText.length() - 1; i >= 0; i--) {
//			System.out.print(inputText.charAt(i));
//		}
//		System.out.println();
//		
//		// .substring을 이용한 방법
//		String reverse = "";
//		for ( int i = inputText.length(); i > 0; i-- ) {
//			reverse += inputText.substring(i-1, i);
//		}
//		System.out.println("로꾸꺼: " + reverse);
//		sc.close();
		
		// 코드정렬 단축키
		// Ctrl + Shift + F
		
		System.out.println("\n==================== 2월 달력 ====================\n");
		
		// 2월 달력을 출력해봅시다.
		// 화요일에 1일 start.
		// startDay 는 요일을 기준으로
		// 일요일은 0, 월요일은 1, 화 2, 수 3, 목 4, 금 5, 토 6
		
		int startDay = 2;
		int lastDay = 28;
		int currentDay = 1;
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for ( int i = 0; i < 42; i++ ) {
			if ( i >= startDay ) {
				System.out.print(currentDay + "\t");
				currentDay++;
				
				if ( currentDay > lastDay ) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			// i가 6, 13, 20, 27인 경우 줄바꿈
			if ( i % 7 == 6 ) {
				System.out.println();
			}
		}
		
		System.out.println("\n=================== 6월 달력 ======================\n");
		
		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for ( int i = 0; i < 42; i++ ) {
			if ( i >= startDay ) {
				if ( currentDay < 10 ) {
					System.out.print(" ");
				} else if ( currentDay > lastDay ) {
						break;
				}
				System.out.print(currentDay + "\t");
				currentDay++;
			} else {
				System.out.print("\t");
			}
			
			if ( i % 7 == 6 ) {
				System.out.println();
			}
		}
	}
}