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
		System.out.print("��ڼ� �Է�: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n+1];
		
		for(int i=0;i<n;i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		System.out.println("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x,n,ky);
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
