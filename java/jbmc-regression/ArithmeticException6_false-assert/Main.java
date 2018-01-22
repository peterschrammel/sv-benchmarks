public class Main {
    public static void  main(String[] args) {
        int denom = args.length - 5;
        try {
            int j=10/denom;
        }
        catch(ArithmeticException exc) {
            assert false;
        }
    }
}
