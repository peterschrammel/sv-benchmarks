public class Main {

  static Main readback;

  public static void main(String[] args) {
    int c=args.length;
    if(c!=1) return;
    Main[] a = new Main[c];
    readback=a[0];
    assert(readback==null);
  }

}
