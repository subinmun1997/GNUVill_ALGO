class chap01Max3m {
	static int max3(int a,int b,int c) {
		int max = a;
		if(max<b)
			max = b;
		if(max<c)
			max = c;
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,2));
		System.out.println("max3(3,1,2) = " + max3(3,1,2));
		System.out.println("max3(3,2,3) = " + max3(3,2,3));
		System.out.println("max3(2,1,3) = " + max3(2,1,3));
		System.out.println("max3(3,3,2) = " + max3(3,3,2));
		System.out.println("max3(3,3,3) = " + max3(3,3,3));
		System.out.println("max3(2,2,3) = " + max3(2,2,3));
		System.out.println("max3(2,3,1) = " + max3(2,3,1));
		System.out.println("max3(2,3,2) = " + max3(2,3,2));
		
	}
}
