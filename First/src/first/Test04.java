package first;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째수 입력 : ");
		// 키보드로부터 정수입력받아서 변수 a에 저장하기

		int a = scan.nextInt();
		System.out.println("두번째수 입력 : ");
		// 키보드로부터 정수입력받아서 변수 b에 저장하기
		
		int b = scan.nextInt();
		System.out.println("당신이 입력한 수는 " + a + ", " + b + " 이군요!");
		
		scan.close();
		}

}
