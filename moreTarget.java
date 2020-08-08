import java.util.Scanner;

class moreTarget {
	static int binSearchX(int[]a,int n,int key) {
		int pl = 0;
		int pr = n-1;
		do {
			int pc = (pl+pr)/2;
			if(a[pc] == key) {
				while(a[pc] == a[pc-1])
					pc--;
				return pc;
			}
			else if(a[pc] < key)
				pl = pc+1;
			else
				pr = pc-1;
		}while(pl<=pr);
		return -1;
	}
	public static void main(String[] args) {
		System.out.print("요솟수: ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		System.out.print("a[0]: ");
		a[0] = stdIn.nextInt();
		
		for(int i=1;i<n;i++) {
			do {
				System.out.print("a[" + i + "] :");
				a[i] = stdIn.nextInt();
			}while(a[i]<a[i-1]);
		}
		System.out.println("키 값 입력: ");
		int key = stdIn.nextInt();
		
		int idx = binSearchX(a,n,key);
		
		if(idx == -1)
			System.out.println("일치하는 요소가 없습니다.");
		else
			System.out.println("a[" + idx + "] :" + idx);
	}
}
