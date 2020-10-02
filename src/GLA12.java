// inner classes cannot have static declarations

// accessing the inner class code from static area of the outer class


// how to access inner class attributes from the instance area of outer class

// how to access outer class attributes inside the inner class

class outer
{
  int a = 10; // outer class instance variable

  class inner
  {
    int a = 20; // inner class instance variable
    public void m1()
    {
      int a = 30; // local variale
      System.out.println(a);
      System.out.println(this.a);
      System.out.println(outer.this.a);
      
    }
  }

}

public class GLA12 {

  public static void main(String[] args) {

  }

}


