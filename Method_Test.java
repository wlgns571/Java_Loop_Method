package java_day08;

import java.util.Scanner;

public class Method_Test {
	public static void main(String[] args) {

		// 명함 만들기
		// 사용자가 이름, 연락처, 이메일을 입력했을때
		// 콘솔에
		// =============================
		// 이름 : [사용자가 입력한 이름]
		// 연락처 : [사용자가 입력한 연락처]
		// 이메일 : [사용자가 입력한 이메일]
		// =============================
		// 와 같은 형태로 출력해주는 함수를 만드시오.
		
		makeCard("김지훈", "010-3055-8832", "wlgns571@gmail.com");
		
		System.out.println("\n==============================\n");
		
		// 성적표 만들기
		// 국어, 영어, 수학 점수를 입력했을 경우,
		// 국어, 영어, 수학, 총점, 평균, 등급을 출력하는 성적표
		// 평균은 소수 둘째자리에서 반올림 하여 출력
		// 90점 이상 A, 80점 이상 B, 70점 이상 c, 60점 이상 d, 나머지 f
		
		// 국어 : 91
		// 영어 : 83
		// 수학 : 77
		// 총점 : 251
		// 평균 : 80.---
		// 등급 : B
		
		makeCard(61,20,83);
		
		System.out.println("\n==========================\n");
		
		// LoopFor에서 했던 각 자리수 더하기를 함수화 하시오.
		System.out.println(eachAdd(2839845));
		System.out.println(eachAdd("2839845"));
		
		// 10진수를 받아 2진수로 출력하시오.
		
		int intVal = 30;
		String binaryString = Integer.toBinaryString(intVal);
		System.out.println(binaryString);
		
		System.out.println(anySec(21));
		
		String myBinaryStr = makeBinary(intVal);
		System.out.println(myBinaryStr);
		
		System.out.println("\n====================\n");
		
		// for문을 배울당시 트리를 만들었다.
		// 사용자가 층(int n)을 입력받아
		// n층 짜리 트리를 출력할 수 있는 메소드를 만들어서
		// 실행시켜 보시오.
		
		makeTree(8);
		
	} // main
	public static void makeTree(int num) {
 		String star = "*";
		String blank = " ";
		
		int i = 1;
		while ( i < num ) {
			if ( i > 1 ) {
				star += "**";
			}
			blank = " ";
			int j = 1;
			while ( j < num - i ) {
				blank += " ";
				j++;
			}
			System.out.println(i + ": " + blank + star);
			i++;
		}
	}
	
	public static String makeBinary(int num) {
		// 30이 들어왔다.
		// 2로 나눠서 나머지는 0 / 몫은 15
		// 15를 2로 나눠서 나머지는 1 / 몫은 7
		// 7을 2로 나눠서 나머지는 1 / 몫은 3
		// 3을 2로 나눠서 나머지는 1 / 몫은 1
		String result = "";
		
		while(true) {
			result += (num % 2);
			
			if (num == 1) {
				break;
			}
			num /= 2;
		}
		return reverseString(result);
	}
	public static String reverseString(String str) {
			String reverse = "";
			for ( int i = str.length(); i > 0; i-- ) {
				reverse += str.substring(i-1, i);
		}
			return reverse;
}
	
	// 10진수를 2진수로
	public static String anySec(int num) {
		String result = "";
        while (num > 0) {
            int share = num / 2;
            int remain = num % 2;
            if (remain < 2) {
                result = remain + result;
            }
            num = share;
        }
        return result;
	}
	
	// 메소드 오버로딩 해서, int도 받고, String도 받아야한다.
	
	public static int eachAdd(int num) {
		int result = 0;
		
		// String num1 = num + ""; <- 숫자를 문자열로 바꾸는 방법
		String num1 = Integer.toString(num);
		for ( int i = 0; i < num1.length(); i++ ) {
			result += Integer.parseInt(num1.substring(i, i+1));
		}
		return result;
	}
	
	public static int eachAdd(String num) {
		int result = 0;
		for ( int i = 0; i < num.length(); i++ ) {
			result += Integer.parseInt(num.substring(i, i+1));
		}
		return result;
	}
	
	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수
	 * @param douNum = 반올림 하고 싶은 실수
	 * @param n = 반올림 하고싶은 자리
	 * @return = 반올림 된 실수
	 */
	public static double round(double douNum, int n) {
		// 소수 두번째 자리에서 반올림해서
		// 소수 첫번째 자리를 만들고 싶다. ( n = 1 )
		// 3.141592 에서 10을 곱한 뒤, Math.round를 적용하고
		// 다시 10으로 나누면 된다.
		
		// 소수 세번재 자리에서 반올림하여
		// 소수 두번째 자리를 만들고 싶다. ( n = 2 )
		// 3.141592 에서 100을 곺한 뒤, Math.round를 적용하고
		// 다시 100으로 나누면 된다.
		
		// douNum = 3.141592, n = 2 를 넣었다면
		int one = 1;
		for ( int i = 0; i < n; i++ ) {
			one *= 10;
		}
		
		// mul = 314.1592
		double mul = douNum * one;
		// longNum = 314
		long longNum = Math.round(mul);
		// douVal = 3.14
		double douVal = (double) longNum / one;
		
		return douVal;
	} 
	
	public static void makeCard(String name, String num, String mail) {
		System.out.println("==============================");
		System.out.println("이름   : " + "[" + name + "]");
		System.out.println("연락처 : " + "[" + num + "]");
		System.out.println("이메일 : " + "[" + mail + "]");
		System.out.println("==============================");
	}
	// 오버로딩한 makeCard
	public static void makeCard(int guk, int eng, int mat) {
		System.out.println("국어 : " + guk);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		
		// 총점 구하기
		int sum = guk + eng + mat;
		System.out.println("총점 : " + sum);
		
		// 평점 구하기 (소수점 둘째자리에서 반올림)
		double avg = (double) sum / 3;
		// double avg = sum / 3.0; <- 정수 나누기 실수로 만듦
		
		// System.out.println("평균 : " + Math.round(avg * 10)/10.0);
		System.out.println("평균 : " + round(avg,1));
		
		// 등급 구하기
		if (avg >= 90) {
			System.out.println("등급 : A");
		} else if ( 90 > avg && avg >= 80 ) {
			System.out.println("등급 : B");
		} else if ( 80 > avg && avg >= 70 ) {
			System.out.println("등급 : C");
		} else if ( 70 > avg && avg >= 60 ) {
			System.out.println("등급 : D");
		} else {
			System.out.println("등급 : F");
		}
	}
}
