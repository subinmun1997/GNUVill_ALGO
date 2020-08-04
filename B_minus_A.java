import java.util.Scanner;

class B_minus_A {
	public static void main(String[] args) {
		System.out.println("a,b 두 수를 입력하세요");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		
		int b;
		
		do {
			System.out.print("b의 값: ");
			b = stdIn.nextInt();
			
		}while(b<=a);
		
		int sum = b-a;
		
		System.out.println("b-a는" + sum + "입니다.");
		
		
	}
}
