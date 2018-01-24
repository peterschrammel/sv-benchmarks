/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/boolean2
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
  public void main(String[] args)
  {
    boolean b=args.length > 2;
    boolean result=f(b);
    assert result==!b;
  }

  public boolean f(boolean b)
  {
    return !b;
  }
}
