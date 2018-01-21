public class Main {
    public static void  main(String args[]) {
        try {
            int i=args.length;
            int j=10/i;
        }
        catch(ArithmeticException exc) {
            assert false;
        }
    }
}
