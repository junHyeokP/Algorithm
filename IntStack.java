package stack;

public class IntStack {
	private int[] stack;
	private int top;
	private int capacity;
	
	IntStack(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];
	}
	
	public boolean push(int num) {
		if (full()) return false;
		
		stack[top++] = num;
		return true;
	}

	public boolean full() {
		return top == capacity;
	}
	
	public int pop() {
	
	if (empty()) return -1;
	
	return stack[--top];
	
	}
	public boolean empty() {
		return top == 0;
	}
	
	public int top() {
		if (empty()) return -1;
		
		return stack[top - 1];
	}
	public int size() {
		return top;
	}
	
	public int capacity() {
		return capacity;
	}
	public void clear() {
		//매개변수로 이름이 같을때에 써주면 좋은 this
		this.top = 0;
	}
	
	public void dump() {
		if (empty()) {
			System.out.println("스택이 비어 있습니다.");
		}
		else {
		for (int i = 0; i < top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
		}
	}
}