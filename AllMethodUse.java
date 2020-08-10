import java.util.Scanner;


class AllMethodUse {
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyAllMethodUseException extends RuntimeException{
		public EmptyAllMethodUseException() {}
	}
	
	public class OverflowAllMethodException extends RuntimeException{
		public OverflowAllMethodException() {}
	}
	
	public AllMethodUse(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	public int push(int x) throws OverflowAllMethodException{
		if(ptr>=max)
			throw new OverflowAllMethodException();
		return stk[ptr++] = x;
	}
	public int pop() throws EmptyAllMethodUseException{
		if(ptr<=0)
			throw new EmptyAllMethodUseException();
		return stk[--ptr];
	}
	public int peek() throws EmptyAllMethodUseException{
		if(ptr<=0)
			throw new EmptyAllMethodUseException();
		return stk[ptr-1];
	}
	public int indexOf(int x) {
		for(int i = ptr-1;i>=0;i--) 
			if(stk[i] == x)
				return i;
		return -1;
	}
	public void clear() {
		ptr = 0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return ptr;
	}
	public boolean isEmpty() {
		return ptr<=0;
	}
	public boolean isFull() {
		return ptr>=max;
	}
	public void dump() {
		if(ptr<=0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i=0;i<ptr;i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		AllMethodUse s = new AllMethodUse(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + "/" + s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)검색 (5)지우세요 (6)비어 있는지 (7)가득 찼는지 (8)덤프 (0)종료");
			
			int menu = stdIn.nextInt();
			if(menu == 0)
				break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (AllMethodUse.OverflowAllMethodException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch(AllMethodUse.EmptyAllMethodUseException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch(AllMethodUse.EmptyAllMethodUseException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4:
				System.out.print("값 하나 입력: ");
				x = stdIn.nextInt();
				int n = s.indexOf(x);
				if(n>=0)
					System.out.println("값은 " + (s.size()-1) + "여기에 있습니다.");
				else
					System.out.println("찾는 값이 없습니다.");
				break;
			case 5 :
				s.clear();
				break;
			case 6 :
				System.out.println((s.isEmpty()? "yes" : "no"));
				break;
			case 7 :
				System.out.println((s.isFull()? " yes" : "no"));
				break;
			case 8 :
				s.dump();
				break;
			}
		}
	}
}
