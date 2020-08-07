import java.util.Scanner;

class SeqSearchSen_For {
	static int seqSearchSen(int [] a, int n, int key) {	
		a[n] = key;
		
		for(int i=0;i<n;i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0;i<num;i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		System.out.println("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x,num,ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
