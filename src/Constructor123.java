public class Constructor123 {
  int rollno; // instance variable
  String name;
  Constructor123 ()
  {
    rollno = 10;
    name = "ABC";
  }
  Constructor123(String str)
  {
    name = str;
    rollno = 0;
  }
  public void m1()
  {
    System.out.println(rollno + " " + name);
  }
  public static void main(String[] args) {
    Constructor123 obj = new Constructor123();
    obj.m1();
    Constructor123 obj1 = new Constructor123("qqq");
    obj1.m1();
  }
}

// overloading
// by providing the different no of arguments

// Constructor123(int )
// Constructor123( int, int)
// Constructor123( int, int, int )

// by providing different types of arguments
// Constructor123 ( int)
// Constructor123( char)
// Constructor123(String);

// Constructor123(int,String)
// Constructor123(String, int)

// this super        and       this() super()

// this and super are keywords in java
// this is used to refer current class instance members
// super is used to refer to the super class instance members


// this() and super() by using these we can make constructor calls
// super() it is used to call super class constructor
// this() it is used to call current class constructor

//inheritance , overloading and overriding
//inheritance and overriding concepts are not applicable for constructor
