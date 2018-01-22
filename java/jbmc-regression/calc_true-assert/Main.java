public class Main
{
  void do_stuff(String a, String b)
  {
    try{
        int x=Integer.parseInt(a);
        int y=Integer.parseInt(b);
        assert Integer.parseInt(a)!=Integer.parseInt(b) || x==y;
    } catch(java.lang.NumberFormatException e) {
    }
  }

  public static void main(String[] args)
  {
    if(args.length<2)
    {
      System.out.println("need two arguments");
      return;
    }
    new Main().do_stuff(args[0], args[1]);
  }
}
