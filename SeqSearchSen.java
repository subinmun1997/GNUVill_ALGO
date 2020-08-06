import java.util.Scanner;

class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		a[n] = key;
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i==n ? -1 : i;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 입력: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n+1];
		
		for(int i=0;i<n;i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		System.out.println("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x,n,ky);
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
	}
}
