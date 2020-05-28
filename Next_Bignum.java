class Next_Bignum {
  public int solution(int n) {
      String bi = Integer.toBinaryString(n);

        int count = Integer.bitCount(n);
        for(int i=n+1;;i++) {
            String bi2 = Integer.toBinaryString(i);
            if(count == Integer.bitCount(i))
                return i;
        }
  }
}
