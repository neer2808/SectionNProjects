public class Callbvbr {

  public void m1(String tstr[])
  {
    System.out.println("in m1 string printing ");
    for (String s:tstr) {
      System.out.println(s);
    }
    tstr[2]="neeraj";
  }
  public static void main(String[] args) {
    String str[] ={"aaa","bbb","ccc","ddd"};

    Callbvbr obj = new Callbvbr();
    obj.m1(str);
    System.out.println("in main method string printing");
    for (String s1:str) {
      System.out.println(s1);
    }

  }

  }

//Array variable assignment
//int arr[]= {10,20,30,40,50};
//char ch[] = {'a','b','c'};
//int arr1[] = arr;
//int arr2[] = ch;  // not valid
////[I   =   // char array it cannot be promoted to int array
//
//int arr4[] = {10,'a'};
//
//String --> Object

// Class Structure

//class Myclass
//{
  // variables
  // methods
  // constructor
  // instance block
  // static block
//}

// variables
//all variables are divided into three categories
// which is based on position of declaration and behaviour
// instance variable
// static variable
// local variable

class Myclass1
{
  // charactersticks
  // actions
}

class person
{

  // elements  attributes  member attributes of the class
  int age;   // instance variables
  String name;
  float height;
  float weight;
  char gender;

  // actions   // methods
  public void walk()   // instance methods
  {
    
  }
  public void talk()
  {

  }
}
