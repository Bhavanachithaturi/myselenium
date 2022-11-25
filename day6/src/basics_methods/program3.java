package basics_methods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class program3  {
  @BeforeClass
  public void login() {
	  System.out.println("welcome to amazon");
  }
  public void operation() {
	  System.out.println("performed succesfully");
  }
  @AfterClass
  public void logout()
  {
	  System.out.println("logout");
  }
}
