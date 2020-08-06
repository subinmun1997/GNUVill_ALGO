import java.util.Scanner;

class SeqSearchFor {
	
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0;i<n;i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소수 입력: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("x[" + i + "] =");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색할 키 값 입력: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x,n,ky);
		if(idx == -1)
			System.out.println("그 값의 요소는 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "] 에 있습니다.");
		
	}
}
