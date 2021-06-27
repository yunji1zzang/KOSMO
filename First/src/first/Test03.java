package first;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0, kor = 0, eng = 0;
		double avg = 0.00;
		
		System.out.println("학생의 이름을 입력해 주세요 = ");
		String name = scan.next();
		
		System.out.println("학생의 국어 점수를 입력해 주세요 = ");
		kor = scan.nextInt();
		
		System.out.println("학생의 영어 점수를 입력해 주세요 = ");
		eng = scan.nextInt();
		
		sum = kor + eng; // 총점 구하기
		avg = sum / 2.00; // 평균 구하기

		System.out.println(name + "학생의 총점은" + sum + "점 입니다.");
		System.out.println(name + "학생의 평균은" + avg + "점 입니다.");
		
		scan.close();

	}

}
