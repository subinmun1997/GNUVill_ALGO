import java.util.Scanner;

class BetweenSum {
	static int sumof(int a, int b) {
		int sum=0;
		if(a<b)
			for(int i=a;i<=b;i++)
				sum+=i;
		else
			for(int i=b;i<=a;i++)
				sum+=i;
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.print("a,b �� �� �Է�: ");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int sum = sumof(a,b);
		System.out.println("a���� b������ ����" + sum + "�Դϴ�.");
		
	}
}
