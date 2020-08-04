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
		System.out.print("a,b 두 수 입력: ");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int sum = sumof(a,b);
		System.out.println("a부터 b까지의 합은" + sum + "입니다.");
		
	}
}
