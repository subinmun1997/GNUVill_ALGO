import java.util.Scanner;

class nPyramid {
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print(i%10);
			System.out.println(); 						// ����(�ٺ�ȯ)
		}
	}
	public static void main(String[] args) {
		System.out.print("�� �� �Ƕ�̵�? : ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		spira(n);
	}
}
