//Team AYO 
//APCS2 pd01
//Lab 02
//2018-04-19
public class QQKachoo<Card> implements Deque<Card>{
    DLLNode<Card> first;
    DLLNode<Card> last;
  
    public void addFirst(Card x) 
    {
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
    
    public Card getFirst()
    {
    return first.getCargo();
    }

    public Card removeFirst()
    {
    Card retVal = first.getCargo();
    first = first.getNext();
    first.setPrev(null);
    return retVal;
    }

    public void addLast(Card x)
    {
    DLLNode<Card> temp = new DLLNode(x, null, null);
    if ((first == null) && (last == null)) {
        first = temp;
        last = temp;
    } else {
        temp.setPrev(first);
        last.setNext(temp);
        last = temp;
    }    
    }

    public Card getLast()
    {
    return last.getCargo();
    }

    public Card removeLast()
    {
    Card retVal = last.getCargo();
    last = last.getPrev();
    last.setNext(null);
    return retVal;    
    }

    public static void main(String[] args)
    {
    Deque<Integer> deck = new QQKachoo<Integer>();
    deck.addFirst(4);
    deck.addFirst(2);
    deck.addFirst(6);            
    deck.addFirst(3);
    deck.addFirst(5);
    deck.addFirst(1);
    System.out.println(deck.getFirst()); // 1
    deck.removeFirst();
    System.out.println(deck.getFirst()); // 5
    System.out.println(deck.getLast()); // 4
    deck.removeLast();
    System.out.println(deck.getLast()); // 2
    deck.addLast(7);
    System.out.println(deck.getLast()); // 7  
    }
}
