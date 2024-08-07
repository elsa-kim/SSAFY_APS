import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QUEUE<T> {

	private List<T> array = new ArrayList<>();
	private int rear = -1;
	private int front = -1;

	public boolean add(T item) {
		try {
			array.add(++rear, item);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean offer(T item) {
		rear++;
		return array.add(item);
	}

	public T remove() {
		if (rear == front) {
			throw new NoSuchElementException();
		}
		return array.get(++front);
	}

	public boolean remove(T value) {
		for (int i = front + 1; i <= rear; i++) {
			if (array.get(i).equals(value)) {
				array.remove(i);
				rear--;
				return true;
			}
		}
		return false;
	}

	public T poll() {
		if (rear == front) {
			return null;
		}
		return array.get(++front);
	}

	public T element() {
		if (rear == front) {
			throw new NoSuchElementException();
		}else {
			return array.get(front + 1);
		}
	}

	public T peek() {
		if (rear == front) {
			return null;
		}
		return array.get(front + 1);
	}

	public void clear() {
		rear = -1;
		front = -1;
	}

	public int size() {
		return rear - front;
	}

	public boolean isEmpty() {
		if (rear == front) {
			return true;
		} else {
			return false;
		}

	}

	public boolean contains(T value) {
		for (int i = front + 1; i <= rear; i++) {
			if (array.get(i).equals(value)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		QUEUE<Integer> queue = new QUEUE<>();
		System.out.println(queue.offer(2));
		queue.offer(4);
		queue.offer(5);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.contains(5));
		System.out.println(queue.contains(6));
		System.out.println(queue.isEmpty());
		queue.poll();
		System.out.println(queue.isEmpty());
		queue.offer(1);
		System.out.println(queue.size());
		queue.clear();
		System.out.println(queue.size());
	}
}
