import java.util.Scanner;

class ShellSort2 {
	static void shellSort(int[] a, int n) {
		int h;
		for(h=1;h<n/9;h=h*3+1)
			;
		for(;h>0;h/=3)
			for(int i=h;i<n;i++) {
				int j;
				int tmp = a[i];
				for(j=i-h;j>=0 && a[j]>tmp; j-=h)
					a[j+h] = a[j];
				a[j+h] = tmp;
			}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("셸 버전(버전 2)");
		System.out.print("요솟수: ");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		
		shellSort(x,n);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<n;i++)
			System.out.println("x[" + i + "] =" + x[i]);
	}
}
