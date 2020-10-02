
// local inner class
class Door1
{ public boolean islocked(String key1)
    { class Lock
          {
              public boolean isvalid(String key2)
              {
                if(key2.equals("12345"))
                {
                  return true;
                }
                else
                {
                  return false;
                }
              }
          }// end of the class
      return new Lock().isvalid(key1);

      //Lock obj1 = new Lock();
      //return obj1.isvalid(key1);
    } // end of the method
}
public class ETest1 {
  public static void main(String[] args) {
   Door1 obj = new Door1();
   boolean result = obj.islocked("12345");
    System.out.println("the result is "+ result);
  }
}
