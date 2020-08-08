public class InstanceBlockDemo1 {
  public void m1()
  {
    System.out.println("inside method1");
  }
  InstanceBlockDemo1()
  {
    System.out.println("inside constructor ");
  }
  static
  {
    System.out.println("inside static block ");
  }
  private void m2()
  {
    System.out.println("inside method 2");
  }
  // instance block
  {
    System.out.println("inside instance block ");
  }

  public static void main(String[] args) {
    System.out.println("in main method ");
    InstanceBlockDemo1 obj1 = new InstanceBlockDemo1();
    obj1.m1();
    InstanceBlockDemo1 obj2 = new InstanceBlockDemo1();

  }

}
