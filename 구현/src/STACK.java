// 스택 구현

import java.util.Arrays;

public class STACK<T>{
	
	@SuppressWarnings("unchecked")
	private T[] array = (T[]) new Object[10];
	private int size = 0;
	
	public void push(T t) {
		if(size==array.length-1) {
			array = Arrays.copyOf(array, size*2);
		}
		array[size++] = t;
	}
	
	public int size() {
		return size;
	}
	
	public T peek() {
		return array[size-1];
	}
	
	public T pop() {
		T item = this.peek();
		array[size-1] = (T) new Object();
		size--;
		return item;
	}
	
	public boolean empty() {
		if(size==0) return true;
		return false;
	}
	
	public int search(T item) {
		for(int i=0; i<size; i++) {
			if(array[i].equals(item)) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		STACK<Integer> myStack = new STACK<>();
		
		System.out.println(myStack.empty());
		myStack.push(3);
		System.out.println(myStack.empty());
		System.out.println(myStack.peek());
		System.out.println(myStack.empty());
		System.out.println(myStack.pop());
		System.out.println(myStack.empty());
		myStack.push(2);
		myStack.push(4);
		System.out.println(myStack.search(1));
		System.out.println(myStack.search(2));
	}
}
