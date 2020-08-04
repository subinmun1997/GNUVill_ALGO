import java.util.Scanner;

class Triangle {
	static void triangleLB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.print("몇 단 직각 이등변 삼각형을 만드실건가요? : ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		triangleLB(n);
	}
}
