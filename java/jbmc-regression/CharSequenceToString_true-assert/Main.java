public class Main
{
    public static void main(String[] args)
    {
        if (args.length<1)
            return;
        CharSequence cs = (CharSequence)args[0];
        String s = cs.toString();
        int i = -1;
        if(s.equals("case1"))
            i = cs.length();
        assert i==-1 || i==5;
    }
}
