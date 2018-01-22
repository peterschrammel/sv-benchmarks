class A extends RuntimeException {}
class B extends A {}
class C extends B {}

public class Main {
  public static void main (String[] args) {
    try {
      try {
	C c = new C();
	A a = new A();
	throw a;
      }
      catch(C exc) {
	assert false;
      }
      catch(B exc) {
	assert false;
      }
    }
    catch(A exc) {
      assert false;
    }

  }
}
