class Main
{
  private static void f(int i, int j) {
    if (i == j) {
      assert false;
    }
    if (i >= j) {
      assert false;
    }
    if (j > i) {
      assert true;
    } else {
      assert false;
    }
    if (j <= i) {
      assert false;
    }
    if (j < i) {
      assert false;
    } else {
      assert true;
    }
  }

  public static void main(String[] args)
  {
    if(args.length+1 < 0)
      return;
    f(args.length, args.length+1);
  }
}
