import java.util.Scanner;

class MinValue3 {
	static int min3(int a,int b,int c) {
		int min = a;
		if(b<min)
			min = b;
		if(c<min)
			min = c;
		return min;
	}
	public static void main(String[] args) {
		int a,b,c;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�� ���� ���� �� �ּڰ��� ���Ͻÿ�.");
		System.out.print("a�� ��: ");
		a = stdIn.nextInt();
		System.out.print("b�� ��: ");
		b = stdIn.nextInt();
		System.out.print("c�� ��: ");
		c = stdIn.nextInt();
		
		int min = min3(a,b,c);
		System.out.println("�ּڰ��� " + min + "�Դϴ�.");
	}
}
