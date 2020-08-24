import java.util.Scanner;

class BubbleSort_left {
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1])
					swap(a,j,j+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("왼쪽부터 버블정렬");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x,nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<nx;i++) {
			System.out.println("x[" + i + "] =" + x[i]);
		}
	}
}
