/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/cast1
 * The benchmark was taken from the repo: 24 January 2018
 */
class Main
{
  public static void main(String[] args)
  {
    int i = args.length;
    if(args.length<-128 || args.length>127)
      return;
    byte b = (byte) i;
    assert b == i;
    short s = (short) i;
    assert s == i;
    char c = (char) i;
    assert c == i;
    long l = (long) i;
    assert l == i;
    float f = (float) i;
    assert f == i;
    double d = (double) i;
    assert d == i;
    f = (float) d;
    assert (float) d == f;
    i = (int) d;
    assert (int) d == i;
    l = (long) d;
    assert i == l;
  }
}

