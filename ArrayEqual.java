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
		System.out.println("배열 a,b의 길이부터 정합시다.");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 길이는? : ");
		int a = stdIn.nextInt();
		
		int[] arrA = new int[a];
		for(int i=0;i<a;i++) {
			System.out.print("arrA[" + i + "] :");
			arrA[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 b의 길이는? : ");
		int b = stdIn.nextInt();
		
		int[] arrB = new int[b];
		for(int i=0;i<b;i++) {
			System.out.print("arrB[" + i + "] :");
			arrB[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 a와 b는 " + (equals(arrA,arrB)? "같습니다.": "같지 않습니다."));
		
	}
}
