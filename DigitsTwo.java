import java.util.Scanner;

class DigitsTwo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("�� �ڸ� ������ �Է��ϼ���.");
		do {
			System.out.print("�Է�: ");
			no=stdIn.nextInt();
		}while(no<10 || no>99);
		
		System.out.println("���� no�� ���� " + no + "�Դϴ�.");
	}
}
