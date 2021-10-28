package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {
	public static void main(String[] args) {
		PriorityQueue <String> pq = new PriorityQueue<String>();
		//Enqueue
		pq.add("Ram");
		pq.add("Sham");
		System.out.println("First ele using element : "+pq.element());
		System.out.println("First ele using peek: "+pq.peek());
		Iterator <String> it = pq.iterator();
		System.out.println("Queue without alteration: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//Dequeue
		pq.remove();
		pq.poll();
		Iterator<String> it1 = pq.iterator();
		System.out.println("Queue after alteration: ");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}
}
