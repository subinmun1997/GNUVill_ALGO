import java.util.Scanner;

class MinValue3 {
	static int min3(int a,int b,int c) {
		int min = a;
		if(b<min)
			min = b;
		if(c<min)
			min = c;
		return min;
	}
	public static void main(String[] args) {
		int a,b,c;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("세 개의 숫자 중 최솟값을 구하시오.");
		System.out.print("a의 값: ");
		a = stdIn.nextInt();
		System.out.print("b의 값: ");
		b = stdIn.nextInt();
		System.out.print("c의 값: ");
		c = stdIn.nextInt();
		
		int min = min3(a,b,c);
		System.out.println("최솟값은 " + min + "입니다.");
	}
}
