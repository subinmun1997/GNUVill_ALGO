import java.util.Scanner;

class Digits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("n값 입력: ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		int no=0;
		while(n>0) {
			n /= 10;
			no++;
		}
		System.out.println("그 수는 " + no + "자리 입니다.");
	}
}
