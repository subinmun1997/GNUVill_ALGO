import java.util.Scanner;
class Fibonacci {
  public static void main(String[] args) {
	  System.out.println("n 값을 입력하세요");
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] fibo = new int[n+1];
      fibo[0] = 0;
      fibo[1] = 1;
      fibo[2] = 1;
      for(int i=3;i<=n;i++){
          fibo[i] = (fibo[i-1]%1234567 + fibo[i-2]%1234567);
      }
      System.out.println(fibo[n]%1234567);
  }
}
