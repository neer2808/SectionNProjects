class Door   // outer class
{
  private Lock lockobj; // instance variable
  public Lock getLockobj() {
    return lockobj;
  }
  public Door()
  {
lockobj = new Lock(true);
  }
  public void shopstatus()
  {
    if(lockobj.isLock())
    {
      System.out.println("welcome, we are open");
    }
    else
      System.out.println("shop is closed");
  }
   class Lock  // member inner class
  {
     private boolean lock;
//     public Lock()
//     {
//     }
     public Lock(boolean lock)
     {
       this.lock = lock;
     }
    public boolean isLock() {
      return lock;
    }
    public void setLock(boolean lock) {
      this.lock = lock;
    }
  }
}
public class Shop {
  public static void main(String[] args) {
     Door obj = new Door();
     obj.shopstatus();
     obj.getLockobj().setLock(false);
     obj.shopstatus();
  }
}
