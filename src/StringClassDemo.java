public class StringClassDemo {

  public static void main(String[] args) {
//    String str1 = new String("GLA");
//    String str2 = new String("GLA");
//    System.out.println(str1 == str2); // false
//   // (== always go for reference comparision )
//    System.out.println(str1.equals(str2)); // true
//    // it will compare the value
//
//    String s1 = "GLA";
//    String s2 = "GLA";
//    System.out.println(s1 == s2);
//    System.out.println(s1.equals(s2));
//
//    StringBuffer sb1 = new StringBuffer("GLA");
//    StringBuffer sb2 = new StringBuffer("GLA");
//    System.out.println(sb1 == sb2 );  // false
//    System.out.println(sb1.equals(sb2)); // false
//
//    StringBuilder s11 = new StringBuilder("yyy");
//    StringBuilder s12 = new StringBuilder("yyy");
//    System.out.println(s11 == s12);
//    System.out.println(s11.equals(s12)); // false
//

    String st1 = new String("aa");
    st1.concat("software");
    st1= st1.concat("solutions");
    System.out.println(st1);

  }

}
