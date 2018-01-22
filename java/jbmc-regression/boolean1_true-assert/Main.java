class Main {

  static public void main(String[] args)
  {
    boolean my_boolean = args.length > 3;
    // Boolean shall be either true or false.
    if(my_boolean == true) return;
    if(my_boolean == false) return;

    assert false;
  }

};
