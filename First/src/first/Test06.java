package first;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 정수를 입력해 주세요 ==>");
		
		int n = scan.nextInt();
		if (n > 0) {
			System.out.println(n + "은 양수입니다.");
		} else if (n < 0) {
			System.out.println(n + "은 음수입니다.");
		} else {
			System.out.println(n + "은 Zero입니다.");
			scan.close();
		}
		}

}
