//Team AYO 
//APCS2 pd01
//Lab 02
//2018-04-19
public class QQKachoo<Card> implements Deque<Card>{
    DLLNode<Card> first;
    DLLNode<Card> last;

   

    //add get remove first
    public void addFirst(Card x) 
    {
	DLLNode<Card> temp = new DLLNode(x, null, null);
	
	if ((first == null) && (last == null)) {
	    first = temp;
	    last = temp;
	} else {
	    temp.setNext(first);
	    if (first!=null)//the logic error in assumingg that last would not be null lies in that it may be the case that one is removing from a size 1 Deque, thereby one of the indicators to first or last is unchanged
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
    //what if first now equals null?
    if (first != null)
	first.setPrev(null);
    else{last=first;}
    return retVal;
    }


    //add, get, remove Last
    public void addLast(Card x)
    {
    DLLNode<Card> temp = new DLLNode(x, null, null);
    if ((first == null) && (last == null)) {
        first = temp;
        last = temp;
    } else {
        //temp.setPrev(first);//very unsettling
	temp.setPrev(last);
	
	if (last!= null)last.setNext(temp);
	
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
    
    if (last!=null)
	last.setNext(null);
    else{first=last;}
    
    return retVal;
    
    }
    
    //toString mmethod for testing
    public String toString(){
	String s="Start-->";
	DLLNode temp = first;
	while (temp!=null){
	    s+=temp.getCargo()+"-->";
	    temp=temp.getNext();
	    
	}
	s+="End";
	return s;
	
    }
    //to test robustity of backward link
    public String backString(){
	String s="-->End";
	DLLNode temp = last;
	while (temp!=null){
	    s="-->"+temp.getCargo()+s;
	    temp=temp.getPrev();
	    
	}
	s="Start"+s;
	return s;
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
