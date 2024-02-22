package Framework;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
	public static void main(String[]args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add("deep");
		pq.add(20);
		pq.add(40.99);
		pq.add(false);
		pq.add(pq);
		System.out.println(pq);
		//output will be error
	}

}
