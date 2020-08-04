import java.util.Scanner;

class RectangleStar {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n°ª ÀÔ·Â: ");
		int n = stdIn.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
