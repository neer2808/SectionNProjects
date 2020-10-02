// Object

// how to perform constructor chaining by using the super()
class father
{
  father(int a)
  {
     System.out.println("father class constructor ");
  }
}
class child extends  father
{
  child()
  {
    super(10);
    System.out.println("child class constructor ");
  }
}
public class Ex1 {

  public static void main(String[] args) {
    child obj1 = new child();

  }
}
