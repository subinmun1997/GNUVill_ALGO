import java.util.Scanner;

class GaussSum {
	public static void main(String[] args) {
		System.out.print("n�� �Է�: ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		int sum = n*(n+1)/2;
		System.out.println("1���� n������ ���� " + sum + "�Դϴ�.");
	}
}
