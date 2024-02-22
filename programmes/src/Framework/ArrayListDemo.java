package Framework;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[]args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(3.5);
		al.add(false);
		al.add("deep");
		al.add(10);
		System.out.println("original list"+al);
		System.out.println("data at idx 2 :"+al.get(2));
		al.add(2,"twoooo");
		System.out.println("updated list (add()) :"+al);
		System.out.println("data at idx 2 :"+al.get(2));
		al.set(2, 22222);
		System.out.println("updated list (set()):"+al);
		System.out.println("data at idx 2 :"+al.get(2));
	}

}
