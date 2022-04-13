package chap03;

public class WorkSpace {

	public static void main(String[] args) {
		
		// "아래의 프로그램을 짜시오. 국어:80 수학:80 영어:60 총점과 평균을 출력하고, 평균에 따른 수우미양가를 출력하시오 "

		int kor = 80;
		int math = 80;
		int eng = 60;

		int total = kor + math + eng;
		double avr = total / 3.0;

		System.out.println("총점은 :" + total);
		System.out.println("평균은 :" + avr);

		if (avr >= 90) {
			System.out.println("수");
		} else if (avr >= 80) {
			System.out.println("우");
		} else if (avr >= 70) {
			System.out.println("미");
		} else if (avr >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}

		// "아래의 프로그램을 짜시오. 77이 3의 배수 또는 2의 배수인지 판단하는 프로그램을 짜시오."

		int num = 77;

		if ((num % 3 == 0) || (num % 2 == 0)) {
			System.out.println(num + "은 3 또는 2의 배수입니다.");
		} else {
			System.out.println(num + "은 3 또는 2의 배수가 아닙니다.");
		}

		// 55 가 홀수 이면 홀수 입니다. 짝수 이면 짝수 입니다. 출력

		int num1 = 55;

		if (num % 2 == 1) {
			System.out.println(num1 + "홀수 입니다.");
		} else {
			System.out.println(num1 + "짝수 입니다.");
		}

		// "상수로 PI 선언 반지름 10 인 원의 넓이를 구하는 프로그램을 짜시오.

		final double PI = 3.14;
		int radius = 10;

		double circle = PI * radius * radius;

		System.out.println(circle);
		
		
		
	}

}
