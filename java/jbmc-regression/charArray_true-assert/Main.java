public class Main {
    public static char[] f(char c[]) {
        if (c != null && c.length > 0) {
            c[0] = 's';
        }
        return c;
    }

    public static void main(String[] args) {
        if(args.length<2 || args[1]==null || args[1].length() < 5)
            return;
        String s = new String("HELLO") + new String(f(args[1].toCharArray()));
        assert s.charAt(5) == 's';
    }
}
