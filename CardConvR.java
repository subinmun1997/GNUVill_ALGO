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
		
		System.out.println("10������ ��� ��ȯ �մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = stdIn.nextInt();
			}while(no<0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36): ");
				cd = stdIn.nextInt();
			}while(cd<2 || cd>36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for(int i=0;i<dno;i++) 
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) :");
			retry = stdIn.nextInt();
		}while(retry==1);
	}
}
