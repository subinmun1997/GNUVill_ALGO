import java.util.Scanner;

class CardConvR {
	static int cardConv(int no,int cd,char[] cno) {
		int digits=0;
		String dchar = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			cno[digits++] = dchar.charAt(no%cd);
			no /= cd;
		}while(no!=0);
		return digits;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환 합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = stdIn.nextInt();
			}while(no<0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36): ");
				cd = stdIn.nextInt();
			}while(cd<2 || cd>36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for(int i=0;i<dno;i++) 
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1.예/0.아니오) :");
			retry = stdIn.nextInt();
		}while(retry==1);
	}
}
