public class DequeTester {

    public static void main(String[] args) {
	Deque d1 = new QQKachoo<Integer>();
	d1.addFirst(1);
	d1.addFirst(2);
	d1.addLast(4);

	System.out.println(d1.removeFirst());
	System.out.println(d1.removeFirst());
	System.out.println(d1.removeFirst());
	System.out.println(d1.removeLast());
    }
    
}
