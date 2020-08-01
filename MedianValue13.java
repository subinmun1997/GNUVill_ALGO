class MedianValue13 {
	static int med(int a,int b,int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		System.out.println("med(3,2,1) = " + med(3,2,1));
		System.out.println("med(3,2,2) = " + med(3,2,2));
		System.out.println("med(3,1,2) = " + med(3,1,2));
		System.out.println("med(3,2,3) = " + med(3,2,3));
		System.out.println("med(2,1,3) = " + med(2,1,3));
		System.out.println("med(3,3,2) = " + med(3,3,2));
		System.out.println("med(3,3,3) = " + med(3,3,3));
		System.out.println("med(2,2,3) = " + med(2,2,3));
		System.out.println("med(2,3,1) = " + med(2,3,1));
		System.out.println("med(2,3,2) = " + med(2,3,2));
	}
}
