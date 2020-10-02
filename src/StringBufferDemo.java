public class StringBufferDemo {

  public static void main(String[] args) {

//    StringBuffer sb = new StringBuffer("GLA");
//    //public char  charAt(int index)
//    System.out.println(sb.charAt(2));
//    char ch = sb.charAt(-1);
//    System.out.println(ch);
    // setCharAt(int index, char value)

//    StringBuffer sb = new StringBuffer("GLA");
//    sb.setCharAt(0,'A');
//    System.out.println(sb);
//  insert(int index, char);
//    StringBuffer sb = new StringBuffer("GLA");
//    sb.insert(0,"Mathura ");
//    System.out.println(sb);
StringBuffer sb = new StringBuffer("GLA University");
sb.ensureCapacity(500);
    System.out.println(sb.capacity());
    sb.trimToSize();
    System.out.println(sb.capacity());

//    System.out.println(sb.length());
//    sb.setLength(3);
//    System.out.println(sb);
// public StringBuffer delete(int begining, int end)
//    sb.delete(4,0);
//    System.out.println(sb);
//sb.deleteCharAt(0);
  //  System.out.println(sb);
//sb.reverse();
  //  System.out.println(sb);


  }
}
