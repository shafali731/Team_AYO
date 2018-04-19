//Team AYO 
//APCS2 pd01
//Lab 02
//2018-04-19
public class QQKachoo<Card> implements Deque<Card>{
    DLLNode first;
    DLLNode last;
  
    public void addFirst(Card x) {
	DLLNode<Card> temp = new DLLNode(x, null, null);
	if ((first == null) && (last == null)) {
	    first = temp;
	    last = temp;
	} else {
	    temp.setNext(first);
	    first.setPrev(temp);
	    first = temp;
	}
    }
    /*public <Card> removeFirst()
      public <Card> getFirst()
      public void addLast()
      public <Card> removeLast()
      public <Card> getLast()*/
}
