class A extends Exception
{
}

class Main
{
  public static void main(String[] args)
  {
    A a = new A();
    try {
      throw a;
    }
    catch (Exception e)
    {
      assert false;
    }
  }
}
