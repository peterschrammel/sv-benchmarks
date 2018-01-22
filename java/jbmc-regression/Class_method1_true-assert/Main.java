public class Main
{
  public static void main(String[] args)
  {
    assert f(String.class, true);
  }

  public static boolean f(Class c, boolean b)
  {
    return b;
  }
}
