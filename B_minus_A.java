import java.util.Scanner;

class B_minus_A {
	public static void main(String[] args) {
		System.out.println("a,b �� ���� �Է��ϼ���");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a�� ��: ");
		int a = stdIn.nextInt();
		
		int b;
		
		do {
			System.out.print("b�� ��: ");
			b = stdIn.nextInt();
			
		}while(b<=a);
		
		int sum = b-a;
		
		System.out.println("b-a��" + sum + "�Դϴ�.");
		
		
	}
}
