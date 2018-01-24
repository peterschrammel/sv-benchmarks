/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/bitwise1
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
  static char c;
  public static void main(String[] args)
  {
    c=(char)(args.length*2 + 1);
    int i = (c | 2);
    assert (i & 3) == 3;
  }
}
