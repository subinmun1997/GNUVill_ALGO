class SumBetween {
  public long solution(int a, int b) {
      long answer = 0;
      if(a<b){
          for(long i=a;i<=b;i++)
              answer+=i;
      }
      else if(a>b){
          for(long i=b;i<=a;i++)
              answer+=i;
      }
      else{
          return a;
      }
      return answer;
  }
  public static void main(String[] args) {
	  SumBetween sb = new SumBetween();
	  System.out.println(sb.solution(5,3));
	  System.out.println(sb.solution(1,7));  
  }
}