interface p1
{
  public void m1();

}
interface p2
{
  public void m1();

}
class c1 implements p1,p2{
  public void m1()
  {
    System.out.println("welcome");
  }
}
public class Multipledemo {
  public static void main(String[] args) {
    c1 obj = new c1();
    obj.m1();
  }
}