class Get_middle_characters {
  public static void main(String[] args){
	  String s = "qwer";
      String answer = "";
      int index = 0;
        if(s.length()%2 != 0) {
            index = s.length()/2;
            answer = s.substring(index, index+1);
        }else {
            index = s.length()/2;
            answer = s.substring(index-1, index+1);
        }
      System.out.println(answer);
  }
}