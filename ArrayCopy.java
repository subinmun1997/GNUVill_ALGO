import java.util.Scanner;

class ArrayCopy {
	static void copy(int[] a ,int[] b) {
		System.out.println("�迭a�� ���縦 �غ���");
		for(int i=0;i<b.length;i++) {
			a[i] = b[i];
		}
		System.out.println("���簡 �� �Ƴ�?");
		for(int i=0;i<a.length;i++) {
			System.out.println("a[" + i + "] :" +a[i]);
		}
	}
	public static void main(String[] args) {
		System.out.print("�迭 b�� ���� ����: ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] b = new int[n];
		int[] a = new int[n];
		
		System.out.println("�迭 b�� ��Ұ� �Է�: ");
		for(int i=0;i<n;i++) {
			System.out.print("b[" + i + "] :");
			b[i] = stdIn.nextInt();
		}
		copy(a,b);
	}
}
