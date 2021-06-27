package first;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String range;
		System.out.println("귀하의 나이를 입력해 주시기 바랍니다 ==>");
		int age = in.nextInt();
		
		if(age >=50)
			range = "50대 이상";
		else {
			if(age >=40)
				range = "40대";
			else {
				if(age >=30)
					range = "30대";
				else {
					if(age >=20)
						range ="20대";
					else 
						range = "20대 이하";
				}
			}
		}
		System.out.println("귀하의 연령대는 " + range + "입니다.");
		in.close();
	}

}
