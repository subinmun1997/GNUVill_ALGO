import java.util.Scanner;
class SumOfArray {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("�迭���� ������! ");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭 ���� ������? : ");
		int n = stdIn.nextInt();
		
		int[] ar = new int[n];
		
		System.out.println("�迭 ��Ұ� �Է�: ");
		for(int i=0;i<n;i++) {
			System.out.print("ar[" + i + "] : ");
			ar[i] = stdIn.nextInt();
		}
		int sum = sumOf(ar);
		System.out.println("�迭 ��Ұ��� ��: " +sum);
	}
}
