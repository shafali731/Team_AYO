public interface Deque<Card>{
  public void addFirst(Card x);
  public Card getFirst();
  public Card removeFirst();
  public Card removeLast();
  public void addLast(Card x);  
  public Card getLast();
}
