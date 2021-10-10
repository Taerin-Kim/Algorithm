package algorithm02;

public class fibo {

	public static void main(String[] args) {
		// 문제 : 피보나치 수열을 입력 받은 숫자 개수만큼 출력하라

		int input = 8; // 8개 출력
		for (int i = 1; i <= input; i++) {
			System.out.println(fibo(i));
		}
	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}
	}
}
