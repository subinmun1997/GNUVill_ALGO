import java.util.Scanner;
import java.util.Random;

class AllRandom {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i])
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���Ͻÿ�");
		System.out.print("����� ���? : ");
		int num = 1 + rand.nextInt(10);
		
		int[] height = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for(int i=0;i<num;i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] :" + height[i]);
		}
		System.out.println("�ִ밪�� " +maxOf(height)+"�Դϴ�.");
	}
}