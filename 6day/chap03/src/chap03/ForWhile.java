package chap03;

public class ForWhile {

	public static void main(String[] args) {
		int dan =3;
		
//		for( int i = 1; i<10; i++ ) {
//			
//			System.out.println( dan + "X" + i + "=" + 3 * i);
//			
//		}
		
//		int n3 = 2;
//		do {
//			int n4 = 1;
//			System.out.println(n3 + "x" + "=" + n3*n4);
//			
//			n3++;
//		}while(n3 < 10);
		
//		int n = 2;
//		
//		while(n < 10) {
//			
//			int j = 1;
//			
//			while(j < 10) {
//				
//				System.out.println( n + "X" + j + "=" + j * n);
//				j++;
//			}
//			n++;
//			System.out.println("");
//		}
		
		
		int sum = 0 ;
		
		for(int i= 1; i<=100; i++ ) {
			 if( (i % 2) == 0 ) {
				 sum += i;
			 }else {
				 sum = sum;
			 }
		}
		
		System.out.println(sum);
		
		int sum1 = 0 ;
		
		for(int i = 0; i<=100; i += 2 ) {
			System.out.println(i);
			sum1 += i;
		}
		
		System.out.println(sum1);
		
		
//		for( int i = 2; i<10; i++ ) {
//			
//			for( int j = 1; j<10; j++) {
//				
//				System.out.println(i + "X" + j + "=" + i*j);
//			}
//			System.out.println("");
//			
//		}
//		
		//int num = 0;
//		while(num < 5) {
//				
//			System.out.println("I like Java" + num);
//			num++;
//			
//		}
//		System.out.println(num);
		
		//int num2 = 5;
		
		//do {
		//	System.out.println("I like Java " + num2);
		//	num2++;
		//}while (num2 < 5);
		
	}

}
