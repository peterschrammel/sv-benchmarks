class A {}

class B extends A {}

class C extends B {}

public class Main {
  public static void main(String[] args) {
      try {
          A c = new C();
          B b = (B)c;
      }
      catch (ClassCastException exc) {
          assert false;
      }
    
  }
}
