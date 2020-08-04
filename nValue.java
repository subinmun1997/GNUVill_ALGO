import java.util.Scanner;

class nValue {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n의 값 입력: ");
		int n = stdIn.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
	}
}
