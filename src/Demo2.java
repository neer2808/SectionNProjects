// a class is a logical entity
// and object is a physical entity

import java.util.Scanner;

class Stu
{
   int rollno;  // elements of the class or member Attributes of the class
   String name;
  public  void show()
  {
    System.out.println(rollno + "    "+ name);
  }

} // end of the stu class

public class Demo2 {
  public static void main(String[] args) {

//    Stu obj1 = new Stu(); // object of the student class
//    obj1.rollno = 10;
//    obj1.name ="aaa";
//    obj1.show();
//    Stu obj2 = new Stu();
//    obj2.rollno = 20;
//    obj2.name = "bbb";
//    obj2.show();
  Stu arr[] = new Stu[5];
  arr[0] = new Stu();
  arr[1] = new Stu();
  arr[2]= new Stu();
  Scanner s = new Scanner(System.in);

    for (int i = 0; i <arr.length ; i++) {
      arr[i] = new Stu();
      arr[i].rollno= s.nextInt();
      s.nextLine();
      arr[i].name= s.nextLine();
    }
    for (int i = 0; i <arr.length ; i++) {
      arr[i].show();
    }

  //int ar[] = new int[5];
  //ar[0] = 10;

// Array element assignment
    int[] arr2 = new int[5];
    arr2[0] = 10;
    arr2[1] = 'a';   //97

// Object class
// parent class of every class is the Object class

Object ar1[] = new Object[5];
ar1[0] = new Object();
ar1[1]= new String("Neeraj");
ar1[2] = new Stu();
ar1[3]= new Integer(10);
// in the  case of Object type array as array element
//we can provide either declared type objects or its
// child class objects.
// class abcd extends Object
//{
//}


      }
}




