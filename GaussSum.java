import java.util.Scanner;

class GaussSum {
	public static void main(String[] args) {
		System.out.print("n값 입력: ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		int sum = n*(n+1)/2;
		System.out.println("1부터 n까지의 합은 " + sum + "입니다.");
	}
}
