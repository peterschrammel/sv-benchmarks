class some_exception1 extends Throwable
{
};

class some_exception2 extends some_exception1
{
};

class Main
{
  public static void main(String[] args)
  {
    try
    {
      throw new some_exception2();
    }
    
    catch(some_exception1 e)
    {
        assert e instanceof some_exception2;
        if (e instanceof some_exception2)
            return;
    }
    assert false;
  }
}

