import java.util.Scanner;

class AllSidesTriangle {
	static void triangleLB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		 for(int i=1;i<n;i++) {
			 for(int j=1;j<=i-1;j++) {
				 System.out.print(' ');
			 }
			 for(int j=1;j<=n-i+1;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
	static void triangleRB(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(' ');
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 단 삼각형? : ");
		int n = stdIn.nextInt();
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
		triangleLB(n);
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형");
		triangleLU(n);
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형");
		triangleRU(n);
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
		triangleRB(n);
	}
}
