package first;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력해 주세요.");
		// -20을 입력해 보면 절대값으로 20이 출력됨
		
		int a = scan.nextInt();
		int b = (a >=0 ) ? a : -a;
		
		System.out.println(a + "의 절대값은 " + b + "입니다.");
		
		scan.close();

	}

}
