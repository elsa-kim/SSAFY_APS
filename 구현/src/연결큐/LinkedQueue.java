package 연결큐;

class Node<T> {
	T data;
	Node<T> link;
}

public class LinkedQueue<T> {
	private Node<T> rear;
	private Node<T> front;
	private int size = 0;
	
	public LinkedQueue() {
		rear = new Node<>();
		front = new Node<>();
	}
	
	public void enQueue(T t) {
		Node<T> newNode = new Node<>();
		newNode.data = t;
		if(size==0) {
			front.link = newNode;
		}
		newNode.link = rear.link;
		rear.link = newNode;
		size++;
	}
	
	public T deQueue() {
		if(size==0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		Node<T> rmNode = front.link;
		rmNode.link = front.link;
		size--;
		return rmNode.data;
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		LinkedQueue<Integer> queue = new LinkedQueue<>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println(queue.size());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.size());
	}
}
