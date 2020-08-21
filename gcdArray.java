import java.util.Scanner;

class gcdArray {
	static int gcd(int x, int y) {
		while(y!=0) {
			int temp = y;
			y = x%y;
			x = temp;
		}
		return x;
	}
	
	static int gcdArray(int[] a, int start, int no) {
		if(no==1)
			return a[start];
		if(no==2)
			return gcd(a[start],a[start+1]);
		else
			return gcd(a[start],gcdArray(a,start+1,no-1));
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�迭 ����: ");
		int n = stdIn.nextInt();
		
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			System.out.print("ar[" + i + "]:");
			ar[i] = stdIn.nextInt();
		}
		System.out.println("�ִ������� " + gcdArray(ar,0,n) + "�Դϴ�.");
	}
}
