package first;

import java.util.Scanner;

public class Test05 {

	
	//두 정수를 입력받아서 조건 연산자를 이용하여 큰 값을 구해서 출력하는 프로그램
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력해 주세요 = ");
		int a = s.nextInt();

		System.out.println("두 번째 수를 입력해 주세요 = ");
		int b = s.nextInt();
		
		int c = (a>b) ? a : b;
		System.out.println("두 수" + a + "와" + b + "중 큰 값은" + c + "입니다.");
		
		s.close();
		}

}
