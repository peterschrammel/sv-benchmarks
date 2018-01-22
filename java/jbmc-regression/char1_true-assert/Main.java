class Main {

  static public void main(String[] args)
  {
    if (args.length == 0 || args[0].length() == 0)
        return;
    char my_char=args[0].charAt(0);
    int x=my_char;
    assert x>=0 && x<='\uffff';

    my_char='\uffff';
    my_char++;
    assert my_char==0;
  }

};
