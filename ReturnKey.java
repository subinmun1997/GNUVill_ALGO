import java.util.Scanner;

class ReturnKey {
	static int searchIdx(int[] a,int n,int key,int[]idx) {
		int count = 0;
		for(int i=0;i<n;i++) 
			if(a[i] == key)
				idx[count++] = i;
		return count;
	}
	public static void main(String[] args) {
		System.out.print("요솟수: ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("a[" + i + "] :");
			a[i] = stdIn.nextInt();
		}
		System.out.println("키 값 입력: ");
		int key = stdIn.nextInt();
		
		int count = searchIdx(a,n,key,b);
		
		if(count == 0)
			System.out.println("일치하는 요소가 없습니다.");
		else
			for(int i=0;i<count;i++)
				System.out.print("a[" + b[i] + "]");
	}
}
