public class ConstructorDemo {
  int num1, num2; // instance variable
//  public void setvalue()
//  {
//    num1 = 10;
//    num2 = 20;
//  }

  public ConstructorDemo()
  {
    num1 = 10;
    num2 = 20;
  }
public ConstructorDemo(int ta, int tb)
{
  num1 = ta;
  num2 = tb;

}
  public void getvalue()
  {
    System.out.println(num1 +"   " + num2 );
  }

} // end of the constructordemo class

class Testingconstructor
{
  public static void main(String[] args) {
    ConstructorDemo obj1 = new ConstructorDemo();
    //obj1.setvalue();
    ConstructorDemo obj2 = new ConstructorDemo(1000, 2000);
    ConstructorDemo obj3 = new ConstructorDemo(67, 89);
    obj1.getvalue();
    obj2.getvalue();
    obj3.getvalue();
  }
}

//obj1      obj2    obj3
//num1
//num2


//constructor name is same as class name
// there is no return type of constructor not even void
// purpose is to initialize the attributes of the class
// constructor invoke when we create object of the class
// constructor cannot be inherited
// if there is no constructor available in the class then compiler will
// provide the default constructor for you
//public classname()
//{
    //super();
//}
// we can declare constructor with public, private, protected and default modifier
// we can overload constructor
// there are two types of constructor
//----  no argument constructor / non parameterised constructor
// parameterised constructor


// String Class constructors
// String str1 = new String();
// String str1 = new String("abc");
// StringBuffer sb = new StringBuffer("abc");
// String str1 = new String(sb);
// String str2 = new String(new StringBuilder("ab"));
// String str3 = new String(char[] c);
// String str4 = new String(byte[] b);




