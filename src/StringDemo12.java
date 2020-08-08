public class StringDemo12 {
  public static void main(String[] args) {
    String str1 = new String("GLA");
    str1.concat("University");
    System.out.println(str1);
    // String objects are immutable
    StringBuffer obj = new StringBuffer("GLA");
    obj.append("university");
    System.out.println(obj);


  }

}

//String class is the most commonly used class in java
// this class is encapsulated inside the java.lang package
//String is not a primitive data type
// when we deal with string actually we deal with String
// objects
// String objects are immutable  ( non changeable)
// StringBuilder, StringBuffer, StringTokenizer ( mutable) changeable
// String str = "GLA"; // valid
// StringBuilder obj = new StringBuilder("ABC"); // valid
// StringBuilder obj1 = "xyz";  // invalid statement
// StringBuffer obj2 = "www";  // invalid Statement






