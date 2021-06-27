package first;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력 =");
		String name = scan.next(); // 키보드로부터 문자 입력받기
		
		System.out.println("나이 입력 =");
		int age = scan.nextInt(); // 키보드로부터 정수 입력받기
		
		System.out.println("입력된 이름 = " + name);
		System.out.println("입력된 나이 = " + age);
		
		scan.close();
		
	}
	}

