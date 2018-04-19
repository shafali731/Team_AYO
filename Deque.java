public interface Deque<Card>{
  public void addFirst(Card x);
  public <Card> removeFirst();
  public <Card> getFirst();
  public void addLast(Card x);
  public <Card>  removeLast();
  public <Card> getLast();
}
