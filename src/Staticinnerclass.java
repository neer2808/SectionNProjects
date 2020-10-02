
// static inner class
class outer5
{
  int num1= 10;  //instance variable
  static int numm2 = 20;  // class variable
  static class inner
  {
    int num3 = 10;
    public static void m1()
    {
      //System.out.println(num1);
      outer5 obj = new outer5();
      System.out.println(obj.num1);
      System.out.println(numm2);
      System.out.println("static inner class static method m1");
    }
  }
}
public  class Staticinnerclass {
  public static void main(String[] args) {
    outer5.inner.m1();
    outer5.inner obj = new outer5.inner();
    System.out.println(obj.num3);
  }
}
//java 1.7  correct

//from java 1.8
//inside interface we can create default methods , static methods
// from java 1.9
// inside interface we can also create private methods



