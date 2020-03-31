import java.util.Scanner;

class Watermelon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = solution(n);
		System.out.println(a);
	}
	public static String solution(int n) {
		String answer = "";
		for(int i=0; i<n; i++) {
			if(i%2==0)
				answer += "¼ö";
			else
				answer += "¹Ú";
		}
		return answer;
	}
}