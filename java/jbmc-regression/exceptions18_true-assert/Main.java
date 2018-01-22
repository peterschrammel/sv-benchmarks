class A extends RuntimeException {}
class B extends A {}

public class Main {
  void foo()
  {
    A a=new A();
    throw a;
  }
  void main(String[] args)
  {
    try
    {
      foo();
      assert false;
    }
    catch(B e)
    {
      assert false;
    } 
  }
  
}
