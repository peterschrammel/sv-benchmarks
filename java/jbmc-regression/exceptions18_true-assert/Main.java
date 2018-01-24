/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions18
 * The benchmark was taken from the repo: 24 January 2018
 */
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
