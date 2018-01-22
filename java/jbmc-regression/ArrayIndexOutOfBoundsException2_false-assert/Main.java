public class Main {
  public static void main(String args[]) {
      try {
          int[] a=new int[4];
          int i=a[args.length];
      }
      catch (ArrayIndexOutOfBoundsException exc) {
          assert false;
      }
  }
}
