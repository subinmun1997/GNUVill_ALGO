import java.util.Scanner;

class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		for(int i=0;i<a.length;i++) {
			if(a[i] != b[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("�迭 a,b�� ���̺��� ���սô�.");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭 a�� ���̴�? : ");
		int a = stdIn.nextInt();
		
		int[] arrA = new int[a];
		for(int i=0;i<a;i++) {
			System.out.print("arrA[" + i + "] :");
			arrA[i] = stdIn.nextInt();
		}
		
		System.out.print("�迭 b�� ���̴�? : ");
		int b = stdIn.nextInt();
		
		int[] arrB = new int[b];
		for(int i=0;i<b;i++) {
			System.out.print("arrB[" + i + "] :");
			arrB[i] = stdIn.nextInt();
		}
		
		System.out.println("�迭 a�� b�� " + (equals(arrA,arrB)? "�����ϴ�.": "���� �ʽ��ϴ�."));
		
	}
}
