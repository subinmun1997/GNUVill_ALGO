import java.util.Scanner;

class nPyramid {
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print(i%10);
			System.out.println(); 						// 개행(줄변환)
		}
	}
	public static void main(String[] args) {
		System.out.print("몇 단 피라미드? : ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		spira(n);
	}
}
