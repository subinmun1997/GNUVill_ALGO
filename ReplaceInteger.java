class ReplaceInteger {
	  public int solution(String s) {
	      int answer = 0;
	      if(s.charAt(0) == '+'){
	          answer = Integer.parseInt(s.substring(1,s.length()));
	      }
	      else if(s.charAt(0) == '-'){
	          answer = Integer.parseInt(s.substring(1,s.length())) *(-1);
	      }
	      else{
	          answer = Integer.parseInt(s);
	      }
	      return answer;
	  }
	  public static void main(String[] args) {
		  ReplaceInteger r = new ReplaceInteger();
		  System.out.println(r.solution("-1234"));
		  System.out.println(r.solution("1234"));
		  
	  }
	}