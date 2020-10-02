
// private method inside the interface
// java 1.9
interface i11
{
  default void m2()
  {
    m1();
    System.out.println("in B.tech 2year ");
  }
  default void m3()
  {
    m1();
    System.out.println("in BTech 1st year");
  }
  private void m1()
  {
    // common code is written inside the m1
    System.out.println("hello");
    System.out.println("welcome");
    System.out.println("to");
    System.out.println("GLA");
    System.out.println("university");
  }
  public static void m8()
  {
    m7();
  }
  public static void m9()
  {
    m7();
  }
  private static void m7()
  {
    // common statements
  }
}
public class ETest11 implements i11 {

  public static void main(String[] args) {
    ETest11 obj = new ETest11();
    obj.m2();
    obj.m3();
  }
}





