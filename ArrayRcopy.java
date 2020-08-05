import java.util.Scanner;

class ArrayRcopy {
	static void rcopy(int[] a, int[] b) {
		System.out.println("배열a에 역순으로 저장하기");
		for(int i=0;i<b.length;i++) {
			a[i] = b[4-i];
		}
		System.out.println("역순으로 저장이 잘 됐나?");
		for(int i=0;i<a.length;i++) {
			System.out.println("a[" + i + "] :" + a[i]);
		}
	}
	public static void main(String[] args) {
		System.out.print("배열 b의 길이 결정: ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] b = new int[n];
		int[] a = new int[n];
		
		System.out.println("배열 b의 요소값 입력: ");
		for(int i=0;i<n;i++) {
			System.out.print("b[" + i + "] :");
			b[i] = stdIn.nextInt();
		}
		rcopy(a,b);
	}
}
