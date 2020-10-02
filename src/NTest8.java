interface i8
{
  default void m1()
  {
    System.out.println("in interface i8");
  }

}
interface  i9
{
  default void m1()
  {
    System.out.println("in interface i9");
  }
}
public class NTest8 implements i8,i9{

  @Override
  public void m1() {
   i8.super.m1();
    i9.super.m1();
  }

  public static void main(String[] args) {
    NTest8 obj = new NTest8();
    obj.m1();
  }

}
