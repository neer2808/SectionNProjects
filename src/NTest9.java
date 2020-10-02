interface i1
{
  public static void m1()
  {
    System.out.println("inside m1");
  }
}
interface i2
{
  public static void m1()
  {
    System.out.println("inside m2");
  }
}
public class NTest9 implements i1 {
  public static void main(String[] args) {
   // NTest9.m1();
    i1.m1();
    i2.m1();

  }

}
