// Anonymous inner class
// Anonymous means name less
// if there is some elements whose name is nothing
// then it is known as Anonymous
// there is one property which is associated with it
// that we can use it only once during the life time
// Anonymous array
// new int[] {10,20,30};
// i am having a class with name Student
// new Student();
// Based on declaration and behaviour
// there are three types
//1) Anonymous inner class that extends a class
//2) Anonymous inner class that implements an interface
//3) Anonymous inner class that defined inside arguments

abstract  class Lock4
{
  public abstract boolean islocked(String passcode);
}
class Door4
{ Lock4 obj = new Lock4() {
    public boolean islocked(String passcode) {
      if(passcode.equals("12345"))
      {
        return true;
      }
      else
        return false;
    } // end of the method
  };
  public Lock4 getObj() {
    return obj;
  }
}
public class Shop4 {
  public static void main(String[] args) {
    Door4 dobj = new Door4();
    boolean res= dobj.getObj().islocked("123455");
    if(res)
    {
      System.out.println("Shop is open ");
    }
    else
      System.out.println("shop is closed");

  }
}
