import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		System.out.println("n °ª ÀÔ·Â: ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int answer = 0;
		
		while(n>1 && answer<=500) {
			if(n%2==0) {
				n=n/2;
				answer++;
			}
			else {
				n=(n*3)+1;
				answer++;
			}
		}
		System.out.println("result: " +answer);
	}
}
