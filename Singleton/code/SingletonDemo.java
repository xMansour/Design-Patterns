

/**
 * Class SingletonDemo
 * This is an example of the singleton design patten
 */
public class SingletonDemo {

  //
  // Fields
  //

  /**
   * This is the only global accessable instance of the class SingletonDemo.
   */
  private SingletonDemo instance = null;


  /**
   * Private constructor to prevent instantiation from any context using the public
   * constructor.
   */
  private void SingletonDemo()
  {
  }

  //
  // methods
  //

  /**
   * This method is used to return the only instance of the class SingletonDemo
   * @return       SingletonDemo
   */
  public static SingletonDemo getInstance()
  {
    if (instance == null)
    	instance = new SingletonDemo;
    
    return instance
  }




}
