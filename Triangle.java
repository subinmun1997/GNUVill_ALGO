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
		System.out.print("�� �� ���� �̵ �ﰢ���� ����ǰǰ���? : ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		triangleLB(n);
	}
}
