package chap03;

public class WorkSpace2 {

	public static void main(String[] args) {
		
		int num = -10;
		num = (num > 0) ? num : (-num);
		System.out.println(num);
		
		//세수 80 33 90 중 가장 큰수 구하기
		
		// 삼항 연산자로 세값 비교 
		int a = 80;
		int b = 33;
		int c = 90;
		
		int comp = (a > b) ? a : b;
		int rst = ( comp > c ) ? comp : c;
		
		System.out.println(rst);
		
		// if문으로 세값 비교
		
		int max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println(max);
		
		if( a > b ) {
			if( a > c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(b > c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
		
		
		
		// 1과 1000 사이의 숫자중 2의 배수 이자 3의 배수인 수는 모두 몇개인가?
		int sum =0;
		for(int i = 0; i <1000; i++) {
			if((i%2) == 0 && (i%3) == 0) {
				sum +=1;
			}
				
		}
		System.out.println(sum);
		
		
		//126500 의 금액을 한국화폐으로 바꾸었을 때 각각 몇 개의 화폐가 필요한지 계산해서 출력하라.
		int price = 126500;
		
		int m1, m2, m3, m4, m5, m6;
		
		m1 = price/50000;
		m2 = (price%50000)/10000;
		m3 = (price%10000)/5000;
		m4 = (price%5000)/1000;
		m5 = (price%1000)/500;
		m6 = (price%500)/100;
		
		
		System.out.println("오만원권: " + m1);
		System.out.println("만원권: " + m2);
		System.out.println("오천원권: " + m3);
		System.out.println("천원권: " + m4);
		System.out.println("오백원권: " + m5);
		System.out.println("백원권: " + m6);
		
		
		
		
	}

}
