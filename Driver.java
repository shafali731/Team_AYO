//Team WhiteFlag (George Liang, Alan Wang)
//APCS2 pd08
//L02 -- All Hands on Deque!
//2018-04-19
public class Driver{
    public static void main(String[]args){
    QQKachoo<String> t = new QQKachoo<String>();
    //System.out.println("Is the deque empty? " + t.isEmpty()); //Expecting true;
    //System.out.println(t.removeFirstOccurrence("removey")); //Will throw exception
    //System.out.println("Size: " + t.size());//Expecting 0
    //Both methods below will throw exceptions
    //t.removeLast();
    //t.removeFirst();
    System.out.println("--------END-------");
    t.addFirst("bob");
    System.out.println("bob");
    t.addFirst("tom");
    System.out.println("tom");
    t.addFirst("jerry");
    System.out.println("jerry");
    System.out.println("-------Front-------");
  //  System.out.println("Size: " + t.size());//Expecting 3
    System.out.println("Checking First: " + t.getFirst());
    System.out.println("Checking Last: " + t.getLast());
    //t.removeFirstOccurrence("bob");
    System.out.println("First occurence of bob was removed");
    //System.out.println("Size: " + t.size());//Size should be 2
    System.out.println("Checking Last: " + t.getLast());//Expecting tom
    t.addLast("timmy");
    System.out.println("timmy was added to the end of the deque");
    System.out.println("Checking Last: " +  t.getLast());//Expecting timmy
    System.out.println("removeing Last: " + t.removeLast());//Expecting timmy
    System.out.println("removeing First: " + t.removeFirst());//Expecting jerry
    System.out.println("Removed: " + t.removeFirst());//Expecting jerry
    System.out.println("First element in deque was removed");
    System.out.println("removeing First: " + t.removeFirst());//Expecting tom
    System.out.println("Removed: " + t.removeLast());//Expecting timmy
    System.out.println("Last element was removed");
    System.out.println("removeing Last: " + t.removeLast());
    System.out.println("Last element was remvoed");
  //  System.out.println(t.size());//Expecting 1
    System.out.println("Since our size is 1, We should have same element as first and last");
    System.out.println("removeing First: " + t.removeFirst());
    System.out.println("removeing Last: " + t.removeLast());
    }
}
