import java.util.Scanner;
import java.util.Arrays;

class inputPoint {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ�:");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		
		System.out.println("������������ �Է��ϼ���.");
		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();
		
		for(int i=1;i<n;i++) {
			do {
				System.out.print("x[" + i + "]:");
				x[i] = stdIn.nextInt();
			}while(x[i]<x[i-1]);
		}
		System.out.print("�˻��� ��: ");
		int key = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx<0) {
			int isPoint = -idx-1;
			System.out.print("���� ����Ʈ�� �� ���:");
			System.out.printf("%d\n",x[isPoint]);
		}
		else {
			System.out.println(key +"��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		}
	}
}
