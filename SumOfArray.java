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
		System.out.println("배열부터 만들자! ");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 길이 몇으로? : ");
		int n = stdIn.nextInt();
		
		int[] ar = new int[n];
		
		System.out.println("배열 요소값 입력: ");
		for(int i=0;i<n;i++) {
			System.out.print("ar[" + i + "] : ");
			ar[i] = stdIn.nextInt();
		}
		int sum = sumOf(ar);
		System.out.println("배열 요소값의 합: " +sum);
	}
}
