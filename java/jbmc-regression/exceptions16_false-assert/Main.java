class A extends RuntimeException {}
class B extends A {}
class C extends B {}

public class Main {
  static void main (String[] args) {
    int x = args.length;
    try {
      x++;
    }
    catch(A exc) {
      assert false;
    }

    try {
      throw new B();
    }
    catch(B exc) {
      assert false;
    }
  }
}
