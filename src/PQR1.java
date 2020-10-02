//Date   util, sql

import java.util.Date;
import java.sql.*;

public class PQR1 {
  public static void main(String[] args) {
    Date obj = new Date();
    System.out.println(obj.getClass().getName());

  }
}

// implicit import
// explicit import
// highest priority goes to explict class import
//next level priority current working directory
// after that implicit class import will considered