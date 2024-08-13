package 연결스택;

class Node<T>{
	T data;
	Node<T> link;
}

public class LinkedStack<T> {
	private Node<T> top;
	private int size = 0;
	public LinkedStack(){
		top = new Node<>();
	}
	
	public void push(T t) {
		Node<T> newNode = new Node<>();
		newNode.data = t;
		newNode.link = top.link;
		top.link = newNode;
		size++;
	}
	
	public T pop() {
		if(size==0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		Node<T> popNode = top.link;
		top.link = popNode.link;
		size--;
		return popNode.data;
	}
	
	public int size() {
		return size;
	}
	
	// 테스트
	public static void main(String[] args) {
		LinkedStack<Integer> stack = new LinkedStack<>();
		
		stack.push(1);
		stack.push(2);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
