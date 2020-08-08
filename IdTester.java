
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
		
		System.out.println("a�� ���̵�: " + a.getId());
		System.out.println("b�� ���̵�: " + b.getId());
		
		System.out.println("�ο��� ���̵��� ����: " + IdTester.getCounter());
	}
}
