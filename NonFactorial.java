import java.util.Scanner;

class NonFactorial {
	static int nonfac(int n) {
		int sum=1;
		if(n>0) {
			for(int i=n;i>0;i--)
				sum*=i;
			return sum;
		}
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼은  " + nonfac(x) + "입니다.");
	}
}
