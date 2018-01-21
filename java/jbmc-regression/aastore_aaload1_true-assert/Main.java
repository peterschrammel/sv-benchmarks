public class Main
{
  static class A {
    int value = 0;
  }
  public static void main(String[] args)
  {
    int size = 10;
    A[] array = new A[size];

    for (int i = 0; i < size; i++) {
      array[i] = new A();
    }
    for (int i = 0; i < size; i++) {
      assert array[i] != null;
    }
  }
}
