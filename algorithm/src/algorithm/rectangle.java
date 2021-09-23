package algorithm;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {

//		입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 
//		   숫자 사각형을 출력하시오
//		4
//
//		정답:   1 2 3 4 
//		       5 6 7 8
//		       9 10 11 12
//		       13 14 15 16 
//		중첩 반복문 (for 혹은 while)

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// n행부터 출력 i는 숫자
		for (int i = 1; i <= n * n; i++) {
			// j는 줄 숫자
			if (i % n == 0) { // n의 배수이면 n개까지출력 되고 줄바뀜
				System.out.println(i);
			} else { // n의 배수가 아니면 그대로 같은 줄에 출력
				System.out.printf("%s ", i);
			}
		}
	}

}
