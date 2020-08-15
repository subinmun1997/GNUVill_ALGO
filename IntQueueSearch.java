import java.util.Scanner;

class IntQueueSearch {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueSearchException extends RuntimeException{
		public EmptyIntQueueSearchException() {}
	}
	
	public class OverflowIntQueueSearchException extends RuntimeException{
		public OverflowIntQueueSearchException() {}
	}
	
	public IntQueueSearch(int capacity) {
		num = front = rear = 0;
		max= capacity;
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueSearchException{
		if(num>=max)
			throw new OverflowIntQueueSearchException();
		que[rear++] = x;
		num++;
		if(num==max)
			rear = 0;
		return x;
	}
	
	public int deque() throws EmptyIntQueueSearchException{
		if(num<=0)
			throw new EmptyIntQueueSearchException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	public int peek() throws EmptyIntQueueSearchException{
		if(num<=0)
			throw new EmptyIntQueueSearchException();
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx = (i+front)%max;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num<=0;
	}
	
	public boolean isFull() {
		return num>=max;
	}
	
	public int search(int x) {
		for(int i=0;i<num;i++) {
			if(que[(i+front)%max] == x)
				return i+1;
		}
		return 0;
	}
	
	public void dump() {
		if(num<=0)
			System.out.println("큐가 비어있습니다.");
		else {
			for(int i=0;i<num;i++)
				System.out.print(que[(i+front)%max] + "");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueueSearch s = new IntQueueSearch(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + "/" + s.capacity());
			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)서치 (0)종료: ");
			
			int menu = stdIn.nextInt();
			if(menu == 0)
				break;
			
			int x;
			
			switch(menu) {
			case 1:
				System.out.print("데이터: ");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				} catch(IntQueueSearch.OverflowIntQueueSearchException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = s.deque();
					System.out.println("디큐한 데이터는  " + x + "입니다.");
				} catch(IntQueueSearch.EmptyIntQueueSearchException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch(IntQueueSearch.EmptyIntQueueSearchException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
	}
}
