 import java.util.*;
 public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(15);
		pq.add(20);
		pq.add(25);
		pq.add(30);
System.out.println("Elements of queue"+pq);
Iterator itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		int removedele = pq.remove();
        System.out.println("Removed element :"+removedele);	
        System.out.println(pq);
        int head = pq.peek();
        System.out.println("head of queue"+head);
        int size = pq.size();
        System.out.println("size of queue"+size);
	    
        System.out.println("poll method"+pq.poll());
        		}
	}


