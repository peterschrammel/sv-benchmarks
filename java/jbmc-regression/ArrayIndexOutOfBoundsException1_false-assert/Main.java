public class Main {
  public static void main(String args[]) {
      try {
          int[] a=new int[4];
          a[args.length]=0;
      }
      catch (ArrayIndexOutOfBoundsException exc) {
          assert false;
      }
  }
}
