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
