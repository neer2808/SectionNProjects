public class OP1 {
  public static void main(String[] args) {
    // the concept of Boxing


   // System.out.println(obj1);
    // 2nd way to perform boxing use the valueOf Method
    Integer obj2 = Integer.valueOf(234);
    Integer obj4 = Integer.valueOf("456");
    System.out.println(obj2);
    OP1 tobj = new OP1();
    System.out.println(tobj);
    Boolean b1 = new Boolean("true");
    Boolean b2 = new Boolean("TrUE");
    System.out.println(b1.equals(b2));
    //unboxing process
    // the process of taking primitive data type out of wrapper class
    //object
    // typevalue()
    // intValue(), byteValue(),shortValue(),,longValue()
    Integer obj = new Integer(123);
    int a  =obj.intValue();
    System.out.println("value of a = "+ a);
    Integer obj1 = new Integer(456);
    String str = obj1.toString();
    System.out.println(str);
    System.out.println(a +str);

    // toString is used with reference type but not primitive type
    int a1 = 70;
    //System.out.println(a1.toString());






  }
}
