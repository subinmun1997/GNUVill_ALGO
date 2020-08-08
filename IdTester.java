
class IdTester {
	private static int counter = 0;
	private int id;
	
	public IdTester() {
		id = ++counter;
	}
	public int getId() {
		return id;
	}
	public static int getCounter(){
		return counter;
	}
	public static void main(String[] args) {
		IdTester a = new IdTester();
		IdTester b = new IdTester();
		
		System.out.println("a의 아이디: " + a.getId());
		System.out.println("b의 아이디: " + b.getId());
		
		System.out.println("부여한 아이디의 개수: " + IdTester.getCounter());
	}
}
