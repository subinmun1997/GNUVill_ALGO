import java.util.Scanner;

class SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i+1;j<n;j++) 
				if(a[j] < a[min])
					min = j;
			swap(a,i,min);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("단순 선택 정렬");
		System.out.print("요솟수: ");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		selectionSort(x,n);
		
		System.out.println("단순 선택 정렬 입니다.");
		for(int i=0;i<n;i++) {
			System.out.println("x[" + i + "] =" + x[i]);
		}
	}
}
