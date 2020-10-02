interface i5
{
  void m1(); // abstract
  default void m2()
  {
    System.out.println("hello");
  }
}
// if you are not using any modifier then it is default
public class NTest5 implements i5 {
  public static void main(String[] args) {
    NTest5 obj = new NTest5();
    obj.m1();
    obj.m2();
  }
  public void m2()
  {

  }
  @Override
  public void m1() {
    System.out.println("welcome");
  }
}
