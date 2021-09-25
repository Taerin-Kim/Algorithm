package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class algorithm11 {

	public static void main(String[] args) {
//		입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 
//		숫자 사각형을 출력하시오
//		4
//
//		정답:  1  2  3  4 
//		      8  7  6  5
//		      9  10 11 12
//		      16 15 14 13
//		중첩 반복문 (for 혹은 while), 조건문(if), 배열
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = i * n + j + 1;
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					arr[i][j] = i * n + n - j;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	// arr[][] 는 n과 n-1
	// ex) 값을 2로 받으면 번지수는 0부터 시작
	// arr[0][0]
	// arr[0][1]
	// arr[1][0]
	// arr[1][1]
	
	//이런식으로 진행됨 

}
