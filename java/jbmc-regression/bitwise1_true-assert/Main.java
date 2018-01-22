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
