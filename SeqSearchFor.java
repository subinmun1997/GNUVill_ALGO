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
		System.out.print("��Ҽ� �Է�: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("x[" + i + "] =");
			x[i] = stdIn.nextInt();
		}
		System.out.print("�˻��� Ű �� �Է�: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x,n,ky);
		if(idx == -1)
			System.out.println("�� ���� ��Ҵ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx + "] �� �ֽ��ϴ�.");
		
	}
}
